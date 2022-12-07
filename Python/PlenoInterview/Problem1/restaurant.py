from orderItem import orderItem

def printReceipt(orderItems, total, numPeople):
    for item in orderItems:
        print(item)
    print("=====================")
    print("Total: {:.2f}".format(total))
    print("Num. of people: ", numPeople)
    print("Total per person:  {:.2f}".format(total/numPeople))

orderItems = []

order = open("inputs/Order1")
dishesNumber = int(order.readline())
numPeople = int(order.readline())
total = 0

lines = order.readlines()
for line in lines:
    itemStr = line.split(" ")
    dishName = itemStr[0]
    dishPrice = float(itemStr[1])
    item = orderItem(dishName, dishPrice)
    orderItems.append(item)
    total += dishPrice

printReceipt(orderItems, total, numPeople)

