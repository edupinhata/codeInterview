class order:

    def __init__(self, numPeople):
        self.orderItems = []
        self.numPeople = numPeople

    def getOrderTotal(self):
        total = 0
        for order in self.orderItems:
            total += order.getTotalPrice()
        return total

    def getTotalPerPerson(self):
        return self.getOrderTotal()/self.numPeople

    def getOrderItemByName(self, dishName):
        for order in self.orderItems:
            if (order.dishName == dishName):
                return order
        return None

    def addNewOrderItem(self, orderItem):
        self.orderItems.append(orderItem)

    def addExistingOrderItem(self, orderItem):
        oi = self.getOrderItemByName(orderItem.dishName)
        oi.amount += 1

    def getTotalPrice(self, orderItem):
        return orderItem.getTotalPrice()

    def printOrder(self):
        self.orderItems.sort(key=lambda oi : oi.getTotalPrice(), reverse=True)
        for order in self.orderItems:
            print(order)
        print("===================")
        print("Total: {:.2f}".format(self.getOrderTotal()))
        print("Num of people: {}".format(self.numPeople))
        print("Total per person: {:.2f}".format(self.getTotalPerPerson()))
