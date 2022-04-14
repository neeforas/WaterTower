import pygame
pygame.init()

screen = pygame.display.set_mode((600, 400))
white = [255,255,255]

running = True
while running:
    pygame.time.Clock().tick(80)
    screen.fill(white)

    pos = pygame.mouse.get_pos()
    mouseXPosition = pos[0]
    mouseYPosition = pos[1]

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
