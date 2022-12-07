
class orderItem:

    def __init__(self, name, price):
        self.dishName = name
        self.amount = 1
        self.price = price

    def getTotalPrice(self):
        return self.price * self.amount

    def __str__(self):
        return "{} | {}x | {:.2f}".format(self.dishName, self.amount, self.getTotalPrice())