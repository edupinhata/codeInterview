from orderItem import orderItem
from order import order

orderFile = open("inputs/Order1")
dishesNumber = int(orderFile.readline())
numPeople = int(orderFile.readline())
total = 0

myOrder = order(numPeople)

lines = orderFile.readlines()
for line in lines:
    itemStr = line.split(" ")
    dishName = itemStr[0]
    dishPrice = float(itemStr[1])
    newOrderItem = orderItem(dishName, dishPrice)

    # Adiciona um novo item
    foundOrderItem = myOrder.getOrderItemByName(dishName)
    if (foundOrderItem != None):
        myOrder.addExistingOrderItem(newOrderItem)
    else:
        myOrder.addNewOrderItem(newOrderItem)

myOrder.printOrder()
