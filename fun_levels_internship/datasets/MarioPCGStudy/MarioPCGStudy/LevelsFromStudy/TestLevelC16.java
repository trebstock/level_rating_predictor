package dk.itu.mario.engine.level;

import java.util.Random;

import dk.itu.mario.MarioInterface.Constraints;
import dk.itu.mario.MarioInterface.GamePlay;
import dk.itu.mario.MarioInterface.LevelInterface;
import dk.itu.mario.engine.sprites.SpriteTemplate;
import dk.itu.mario.engine.sprites.Enemy;

//THIS IS THE ONE
//java -cp bin dk.itu.mario.engine.PlayCustomized
//This is 16 units high, the MoraiMaker is 14 units high with a 52x52 unit blocks as the assumption
public class TestLevelC16 extends Level{
	//Store information about the level
	 public   int ENEMIES = 0; //the number of enemies the level contains
	 public   int BLOCKS_EMPTY = 0; // the number of empty blocks
	 public   int BLOCKS_COINS = 0; // the number of coin blocks
	 public   int BLOCKS_POWER = 0; // the number of power blocks
	 public   int COINS = 0; //These are the coins in boxes that Mario collect
 
	private static Random levelSeedRandom = new Random();
	    public static long lastSeed;

	    Random random;

  
	    private int difficulty;
	    private int type;
		private int gaps;
		
		public TestLevelC16(int width, int height)
	    {
			super(width, height);
	    }


		public TestLevelC16(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
	    {
	        this(width, height);
	        creat(seed, difficulty, type);
	    }

	    public void creat(long seed, int difficulty, int type)
	    {
	        this.type = type;
	        this.difficulty = difficulty;

	        lastSeed = seed;
	        random = new Random(seed);
			setBlock(0, 13, HILL_TOP);
			setBlock(0, 14, GROUND);
			setBlock(1, 13, HILL_TOP);
			setBlock(1, 14, GROUND);
			setBlock(2, 13, HILL_TOP);
			setBlock(2, 14, GROUND);
			setBlock(3, 13, HILL_TOP);
			setBlock(3, 14, GROUND);
			setBlock(4, 13, HILL_TOP);
			setBlock(4, 14, GROUND);
			setBlock(5, 13, HILL_TOP);
			setBlock(5, 14, GROUND);
			setBlock(6, 13, HILL_TOP);
			setBlock(6, 14, GROUND);
			setBlock(7, 13, HILL_TOP);
			setBlock(7, 14, GROUND);
			setBlock(8, 13, HILL_TOP);
			setBlock(8, 14, GROUND);
			setBlock(9, 13, HILL_TOP);
			setBlock(9, 14, GROUND);
			setBlock(10, 13, HILL_TOP);
			setBlock(10, 14, GROUND);
			setBlock(11, 13, HILL_TOP);
			setBlock(11, 14, GROUND);
			setBlock(12, 13, HILL_TOP);
			setBlock(12, 14, GROUND);
			setBlock(13, 13, HILL_TOP);
			setBlock(13, 14, GROUND);
			setBlock(14, 13, HILL_TOP);
			setBlock(14, 14, GROUND);
			setBlock(15, 13, HILL_TOP);
			setBlock(15, 14, GROUND);
			setBlock(24, 11, TUBE_TOP_LEFT);
			setBlock(25, 11, TUBE_TOP_RIGHT);
			setBlock(17, 9, BLOCK_COIN);
			setBlock(18, 9, BLOCK_EMPTY);
			setBlock(19, 9, BLOCK_EMPTY);
			setBlock(18, 5, BLOCK_POWERUP);
			setBlock(24, 12, TUBE_SIDE_LEFT);
			setBlock(25, 12, TUBE_SIDE_RIGHT);
			setBlock(16, 13, HILL_TOP);
			setBlock(16, 14, GROUND);
			setBlock(17, 13, HILL_TOP);
			setBlock(17, 14, GROUND);
			setBlock(18, 13, HILL_TOP);
			setBlock(18, 14, GROUND);
			setBlock(19, 13, HILL_TOP);
			setBlock(19, 14, GROUND);
			setBlock(20, 13, HILL_TOP);
			setBlock(20, 14, GROUND);
			setBlock(21, 13, HILL_TOP);
			setBlock(21, 14, GROUND);
			setBlock(22, 13, HILL_TOP);
			setBlock(22, 14, GROUND);
			setBlock(23, 13, HILL_TOP);
			setBlock(23, 14, GROUND);
			setBlock(24, 13, HILL_TOP);
			setBlock(24, 14, GROUND);
			setBlock(25, 13, HILL_TOP);
			setBlock(25, 14, GROUND);
			setBlock(26, 13, HILL_TOP);
			setBlock(26, 14, GROUND);
			setBlock(27, 13, HILL_TOP);
			setBlock(27, 14, GROUND);
			setBlock(28, 13, HILL_TOP);
			setBlock(28, 14, GROUND);
			setBlock(29, 13, HILL_TOP);
			setBlock(29, 14, GROUND);
			setBlock(30, 13, HILL_TOP);
			setBlock(30, 14, GROUND);
			setSpriteTemplate(35, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(31, 13, HILL_TOP);
			setBlock(31, 14, GROUND);
			setBlock(32, 13, HILL_TOP);
			setBlock(32, 14, GROUND);
			setBlock(33, 13, HILL_TOP);
			setBlock(33, 14, GROUND);
			setBlock(34, 13, HILL_TOP);
			setBlock(34, 14, GROUND);
			setBlock(35, 13, HILL_TOP);
			setBlock(35, 14, GROUND);
			setBlock(36, 13, HILL_TOP);
			setBlock(36, 14, GROUND);
			setBlock(37, 13, HILL_TOP);
			setBlock(37, 14, GROUND);
			setBlock(38, 13, HILL_TOP);
			setBlock(38, 14, GROUND);
			setBlock(39, 13, HILL_TOP);
			setBlock(39, 14, GROUND);
			setBlock(40, 13, HILL_TOP);
			setBlock(40, 14, GROUND);
			setBlock(43, 13, HILL_TOP);
			setBlock(43, 14, GROUND);
			setBlock(44, 13, HILL_TOP);
			setBlock(44, 14, GROUND);
			setBlock(45, 13, HILL_TOP);
			setBlock(45, 14, GROUND);
			setBlock(54, 11, TUBE_TOP_LEFT);
			setBlock(55, 11, TUBE_TOP_RIGHT);
			setBlock(42, 9, BLOCK_COIN);
			setBlock(48, 9, BLOCK_EMPTY);
			setBlock(49, 9, BLOCK_EMPTY);
			setBlock(46, 13, HILL_TOP);
			setBlock(46, 14, GROUND);
			setBlock(47, 13, HILL_TOP);
			setBlock(47, 14, GROUND);
			setBlock(48, 13, HILL_TOP);
			setBlock(48, 14, GROUND);
			setBlock(49, 13, HILL_TOP);
			setBlock(49, 14, GROUND);
			setBlock(50, 13, HILL_TOP);
			setBlock(50, 14, GROUND);
			setBlock(51, 13, HILL_TOP);
			setBlock(51, 14, GROUND);
			setBlock(52, 13, HILL_TOP);
			setBlock(52, 14, GROUND);
			setBlock(53, 13, HILL_TOP);
			setBlock(53, 14, GROUND);
			setBlock(54, 13, HILL_TOP);
			setBlock(54, 14, GROUND);
			setBlock(55, 13, HILL_TOP);
			setBlock(55, 14, GROUND);
			setBlock(56, 13, HILL_TOP);
			setBlock(56, 14, GROUND);
			setBlock(57, 13, HILL_TOP);
			setBlock(57, 14, GROUND);
			setBlock(58, 13, HILL_TOP);
			setBlock(58, 14, GROUND);
			setBlock(59, 13, HILL_TOP);
			setBlock(59, 14, GROUND);
			setBlock(60, 13, HILL_TOP);
			setBlock(60, 14, GROUND);
			setBlock(48, 5, BLOCK_POWERUP);
			setBlock(54, 12, TUBE_SIDE_LEFT);
			setBlock(55, 12, TUBE_SIDE_RIGHT);
			setBlock(66, 13, HILL_TOP);
			setBlock(66, 14, GROUND);
			setBlock(67, 13, HILL_TOP);
			setBlock(67, 14, GROUND);
			setBlock(68, 13, HILL_TOP);
			setBlock(68, 14, GROUND);
			setBlock(69, 13, HILL_TOP);
			setBlock(69, 14, GROUND);
			setBlock(70, 13, HILL_TOP);
			setBlock(70, 14, GROUND);
			setBlock(71, 13, HILL_TOP);
			setBlock(71, 14, GROUND);
			setBlock(72, 13, HILL_TOP);
			setBlock(72, 14, GROUND);
			setBlock(73, 13, HILL_TOP);
			setBlock(73, 14, GROUND);
			setBlock(74, 13, HILL_TOP);
			setBlock(74, 14, GROUND);
			setBlock(75, 13, HILL_TOP);
			setBlock(75, 14, GROUND);
			setBlock(76, 13, HILL_TOP);
			setBlock(76, 14, GROUND);
			setBlock(77, 13, HILL_TOP);
			setBlock(77, 14, GROUND);
			setBlock(78, 13, HILL_TOP);
			setBlock(78, 14, GROUND);
			setBlock(79, 13, HILL_TOP);
			setBlock(79, 14, GROUND);
			setBlock(74, 11, TUBE_TOP_LEFT);
			setBlock(75, 11, TUBE_TOP_RIGHT);
			setBlock(69, 9, BLOCK_COIN);
			setBlock(69, 9, BLOCK_POWERUP);
			setBlock(68, 9, BLOCK_EMPTY);
			setBlock(69, 9, BLOCK_EMPTY);
			setBlock(74, 12, TUBE_SIDE_LEFT);
			setBlock(75, 12, TUBE_SIDE_RIGHT);
			setBlock(61, 13, HILL_TOP);
			setBlock(61, 14, GROUND);
			setBlock(62, 13, HILL_TOP);
			setBlock(62, 14, GROUND);
			setBlock(63, 13, HILL_TOP);
			setBlock(63, 14, GROUND);
			setBlock(64, 13, HILL_TOP);
			setBlock(64, 14, GROUND);
			setBlock(65, 13, HILL_TOP);
			setBlock(65, 14, GROUND);
			setSpriteTemplate(86, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setSpriteTemplate(39, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(80, 9, BLOCK_COIN);
			setBlock(83, 13, HILL_TOP);
			setBlock(83, 14, GROUND);
			setBlock(84, 13, HILL_TOP);
			setBlock(84, 14, GROUND);
			setBlock(85, 13, HILL_TOP);
			setBlock(85, 14, GROUND);
			setBlock(86, 13, HILL_TOP);
			setBlock(86, 14, GROUND);
			setBlock(87, 13, HILL_TOP);
			setBlock(87, 14, GROUND);
			setBlock(88, 13, HILL_TOP);
			setBlock(88, 14, GROUND);
			setBlock(89, 13, HILL_TOP);
			setBlock(89, 14, GROUND);
			setBlock(90, 13, HILL_TOP);
			setBlock(90, 14, GROUND);
			setBlock(93, 11, ROCK);
			setBlock(93, 10, ROCK);
			setBlock(95, 9, ROCK);
			setBlock(95, 11, ROCK);
			setBlock(95, 10, ROCK);
			setBlock(97, 8, ROCK);
			setBlock(97, 9, ROCK);
			setBlock(97, 10, ROCK);
			setBlock(97, 11, ROCK);
			setBlock(97, 6, ROCK);
			setBlock(97, 7, ROCK);
			setBlock(98, 5, ROCK);
			setBlock(99, 5, ROCK);
			setBlock(98, 9, ROCK);
			setBlock(99, 9, ROCK);
			setBlock(99, 6, ROCK);
			setBlock(99, 7, ROCK);
			setBlock(99, 10, ROCK);
			setBlock(99, 11, ROCK);
			setBlock(99, 8, ROCK);
			setBlock(91, 13, HILL_TOP);
			setBlock(91, 14, GROUND);
			setBlock(92, 13, HILL_TOP);
			setBlock(92, 14, GROUND);
			setBlock(93, 13, HILL_TOP);
			setBlock(93, 14, GROUND);
			setBlock(94, 13, HILL_TOP);
			setBlock(94, 14, GROUND);
			setBlock(88, 12, TUBE_SIDE_LEFT);
			setBlock(89, 12, TUBE_SIDE_RIGHT);
			setBlock(88, 11, TUBE_TOP_LEFT);
			setBlock(89, 11, TUBE_TOP_RIGHT);
			setBlock(108, 11, ROCK);
			setBlock(108, 10, ROCK);
			setBlock(110, 9, ROCK);
			setBlock(110, 11, ROCK);
			setBlock(110, 10, ROCK);
			setBlock(112, 8, ROCK);
			setBlock(112, 9, ROCK);
			setBlock(112, 10, ROCK);
			setBlock(112, 11, ROCK);
			setBlock(112, 6, ROCK);
			setBlock(112, 7, ROCK);
			setBlock(113, 5, ROCK);
			setBlock(114, 5, ROCK);
			setBlock(113, 9, ROCK);
			setBlock(114, 9, ROCK);
			setBlock(114, 6, ROCK);
			setBlock(114, 7, ROCK);
			setBlock(114, 10, ROCK);
			setBlock(114, 11, ROCK);
			setBlock(114, 8, ROCK);
			setBlock(102, 13, HILL_TOP);
			setBlock(102, 14, GROUND);
			setBlock(103, 13, HILL_TOP);
			setBlock(103, 14, GROUND);
			setBlock(104, 13, HILL_TOP);
			setBlock(104, 14, GROUND);
			setBlock(105, 13, HILL_TOP);
			setBlock(105, 14, GROUND);
			setBlock(106, 13, HILL_TOP);
			setBlock(106, 14, GROUND);
			setBlock(107, 13, HILL_TOP);
			setBlock(107, 14, GROUND);
			setBlock(108, 13, HILL_TOP);
			setBlock(108, 14, GROUND);
			setBlock(109, 13, HILL_TOP);
			setBlock(109, 14, GROUND);
			setBlock(103, 12, TUBE_SIDE_LEFT);
			setBlock(104, 12, TUBE_SIDE_RIGHT);
			setBlock(103, 11, TUBE_TOP_LEFT);
			setBlock(104, 11, TUBE_TOP_RIGHT);
			setBlock(124, 11, ROCK);
			setBlock(124, 12, ROCK);
			setBlock(125, 12, ROCK);
			setBlock(125, 10, ROCK);
			setBlock(125, 11, ROCK);
			setBlock(126, 10, ROCK);
			setBlock(126, 11, ROCK);
			setBlock(126, 12, ROCK);
			setBlock(126, 9, ROCK);
			setBlock(127, 9, ROCK);
			setBlock(127, 10, ROCK);
			setBlock(127, 11, ROCK);
			setBlock(127, 12, ROCK);
			setBlock(127, 8, ROCK);
			setBlock(128, 8, ROCK);
			setBlock(128, 9, ROCK);
			setBlock(128, 10, ROCK);
			setBlock(128, 11, ROCK);
			setBlock(128, 12, ROCK);
			setBlock(128, 7, ROCK);
			setSpriteTemplate(123, 11, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(116, 5, BLOCK_EMPTY);
			setBlock(117, 5, BLOCK_EMPTY);
			setBlock(119, 13, HILL_TOP);
			setBlock(119, 14, GROUND);
			setBlock(120, 13, HILL_TOP);
			setBlock(120, 14, GROUND);
			setBlock(121, 13, HILL_TOP);
			setBlock(121, 14, GROUND);
			setBlock(122, 13, HILL_TOP);
			setBlock(122, 14, GROUND);
			setBlock(123, 13, HILL_TOP);
			setBlock(123, 14, GROUND);
			setBlock(124, 13, HILL_TOP);
			setBlock(124, 14, GROUND);
			setBlock(125, 13, HILL_TOP);
			setBlock(125, 14, GROUND);
			setBlock(126, 13, HILL_TOP);
			setBlock(126, 14, GROUND);
			setBlock(127, 13, HILL_TOP);
			setBlock(127, 14, GROUND);
			setBlock(129, 12, ROCK);
			setBlock(128, 13, HILL_TOP);
			setBlock(128, 14, GROUND);
			setBlock(129, 13, HILL_TOP);
			setBlock(129, 14, GROUND);
			setBlock(130, 13, HILL_TOP);
			setBlock(130, 14, GROUND);
			setBlock(131, 13, HILL_TOP);
			setBlock(131, 14, GROUND);
			setBlock(132, 13, HILL_TOP);
			setBlock(132, 14, GROUND);
			setBlock(133, 13, HILL_TOP);
			setBlock(133, 14, GROUND);
			setBlock(134, 13, HILL_TOP);
			setBlock(134, 14, GROUND);
			setBlock(135, 13, HILL_TOP);
			setBlock(135, 14, GROUND);
			setBlock(136, 13, HILL_TOP);
			setBlock(136, 14, GROUND);
			setBlock(137, 13, HILL_TOP);
			setBlock(137, 14, GROUND);
			setBlock(138, 13, HILL_TOP);
			setBlock(138, 14, GROUND);
			setBlock(139, 13, HILL_TOP);
			setBlock(139, 14, GROUND);
			setBlock(94, 11, ROCK);
			setBlock(94, 10, ROCK);
			setBlock(96, 9, ROCK);
			setBlock(96, 11, ROCK);
			setBlock(96, 10, ROCK);
			setBlock(98, 8, ROCK);
			setBlock(98, 10, ROCK);
			setBlock(98, 11, ROCK);
			setBlock(98, 6, ROCK);
			setBlock(98, 7, ROCK);
			setBlock(109, 11, ROCK);
			setBlock(109, 10, ROCK);
			setBlock(111, 9, ROCK);
			setBlock(111, 11, ROCK);
			setBlock(111, 10, ROCK);
			setBlock(113, 8, ROCK);
			setBlock(113, 10, ROCK);
			setBlock(113, 11, ROCK);
			setBlock(113, 6, ROCK);
			setBlock(113, 7, ROCK);
			xExit = 128;
			yExit = 13;

	    }


	    private int buildJump(int xo, int maxLength)
	    {	gaps++;
	    	//jl: jump length
	    	//js: the number of blocks that are available at either side for free
	        int js = random.nextInt(4) + 2;
	        int jl = random.nextInt(2) + 2;
	        int length = js * 2 + jl;

	        boolean hasStairs = random.nextInt(3) == 0;

	        int floor = height - 1 - random.nextInt(4);
	      //run from the start x position, for the whole length
	        for (int x = xo; x < xo + length; x++)
	        {
	            if (x < xo + js || x > xo + length - js - 1)
	            {
	            	//run for all y's since we need to paint blocks upward
	                for (int y = 0; y < height; y++)
	                {	//paint ground up until the floor
	                    if (y >= floor)
	                    {
	                        setBlock(x, y, GROUND);
	                    }
	                  //if it is above ground, start making stairs of rocks
	                    else if (hasStairs)
	                    {	//LEFT SIDE
	                        if (x < xo + js)
	                        { //we need to max it out and level because it wont
	                          //paint ground correctly unless two bricks are side by side
	                            if (y >= floor - (x - xo) + 1)
	                            {
	                                setBlock(x, y, ROCK);
	                            }
	                        }
	                        else
	                        { //RIGHT SIDE
	                            if (y >= floor - ((xo + length) - x) + 2)
	                            {
	                                setBlock(x, y, ROCK);
	                            }
	                        }
	                    }
	                }
	            }
	        }

	        return length;
	    }

	    private int buildCannons(int xo, int maxLength)
	    {
	        int length = random.nextInt(10) + 2;
	        if (length > maxLength) length = maxLength;

	        int floor = height - 1 - random.nextInt(4);
	        int xCannon = xo + 1 + random.nextInt(4);
	        for (int x = xo; x < xo + length; x++)
	        {
	            if (x > xCannon)
	            {
	                xCannon += 2 + random.nextInt(4);
	            }
	            if (xCannon == xo + length - 1) xCannon += 10;
	            int cannonHeight = floor - random.nextInt(4) - 1;

	            for (int y = 0; y < height; y++)
	            {
	                if (y >= floor)
	                {
	                    setBlock(x, y, GROUND);
	                }
	                else
	                {
	                    if (x == xCannon && y >= cannonHeight)
	                    {
	                        if (y == cannonHeight)
	                        {
	                            setBlock(x, y, (byte) (14 + 0 * 16));
	                        }
	                        else if (y == cannonHeight + 1)
	                        {
	                            setBlock(x, y, (byte) (14 + 1 * 16));
	                        }
	                        else
	                        {
	                            setBlock(x, y, (byte) (14 + 2 * 16));
	                        }
	                    }
	                }
	            }
	        }

	        return length;
	    }

	    private int buildHillStraight(int xo, int maxLength)
	    {
	        int length = random.nextInt(10) + 10;
	        if (length > maxLength) length = maxLength;

	        int floor = height - 1 - random.nextInt(4);
	        for (int x = xo; x < xo + length; x++)
	        {
	            for (int y = 0; y < height; y++)
	            {
	                if (y >= floor)
	                {
	                    setBlock(x, y, GROUND);
	                }
	            }
	        }

	        addEnemyLine(xo + 1, xo + length - 1, floor - 1);

	        int h = floor;

	        boolean keepGoing = true;

	        boolean[] occupied = new boolean[length];
	        while (keepGoing)
	        {
	            h = h - 2 - random.nextInt(3);

	            if (h <= 0)
	            {
	                keepGoing = false;
	            }
	            else
	            {
	                int l = random.nextInt(5) + 3;
	                int xxo = random.nextInt(length - l - 2) + xo + 1;

	                if (occupied[xxo - xo] || occupied[xxo - xo + l] || occupied[xxo - xo - 1] || occupied[xxo - xo + l + 1])
	                {
	                    keepGoing = false;
	                }
	                else
	                {
	                    occupied[xxo - xo] = true;
	                    occupied[xxo - xo + l] = true;
	                    addEnemyLine(xxo, xxo + l, h - 1);
	                    if (random.nextInt(4) == 0)
	                    {
	                        decorate(xxo - 1, xxo + l + 1, h);
	                        keepGoing = false;
	                    }
	                    for (int x = xxo; x < xxo + l; x++)
	                    {
	                        for (int y = h; y < floor; y++)
	                        {
	                            int xx = 5;
	                            if (x == xxo) xx = 4;
	                            if (x == xxo + l - 1) xx = 6;
	                            int yy = 9;
	                            if (y == h) yy = 8;

	                            if (getBlock(x, y) == 0)
	                            {
	                                setBlock(x, y, (byte) (xx + yy * 16));
	                            }
	                            else
	                            {
	                                if (getBlock(x, y) == HILL_TOP_LEFT) setBlock(x, y, HILL_TOP_LEFT_IN);
	                                if (getBlock(x, y) == HILL_TOP_RIGHT) setBlock(x, y, HILL_TOP_RIGHT_IN);
	                            }
	                        }
	                    }
	                }
	            }
	        }

	        return length;
	    }

	    private void addEnemyLine(int x0, int x1, int y)
	    {
	        for (int x = x0; x < x1; x++)
	        {
	            if (random.nextInt(35) < difficulty + 1)
	            {
	                int type = random.nextInt(4);

	                if (difficulty < 1)
	                {
	                    type = Enemy.ENEMY_GOOMBA;
	                }
	                else if (difficulty < 3)
	                {
	                    type = random.nextInt(3);
	                }

	                setSpriteTemplate(x, y, new SpriteTemplate(type, random.nextInt(35) < difficulty));
	                ENEMIES++;
	            }
	        }
	    }

	    private int buildTubes(int xo, int maxLength)
	    {
	        int length = random.nextInt(10) + 5;
	        if (length > maxLength) length = maxLength;

	        int floor = height - 1 - random.nextInt(4);
	        int xTube = xo + 1 + random.nextInt(4);
	        int tubeHeight = floor - random.nextInt(2) - 2;
	        for (int x = xo; x < xo + length; x++)
	        {
	            if (x > xTube + 1)
	            {
	                xTube += 3 + random.nextInt(4);
	                tubeHeight = floor - random.nextInt(2) - 2;
	            }
	            if (xTube >= xo + length - 2) xTube += 10;

	            if (x == xTube && random.nextInt(11) < difficulty + 1)
	            {
	                setSpriteTemplate(x, tubeHeight, new SpriteTemplate(Enemy.ENEMY_FLOWER, false));
	                ENEMIES++;
	            }

	            for (int y = 0; y < height; y++)
	            {
	                if (y >= floor)
	                {
	                    setBlock(x, y,GROUND);

	                }
	                else
	                {
	                    if ((x == xTube || x == xTube + 1) && y >= tubeHeight)
	                    {
	                        int xPic = 10 + x - xTube;

	                        if (y == tubeHeight)
	                        {
	                        	//tube top
	                            setBlock(x, y, (byte) (xPic + 0 * 16));
	                        }
	                        else
	                        {
	                        	//tube side
	                            setBlock(x, y, (byte) (xPic + 1 * 16));
	                        }
	                    }
	                }
	            }
	        }

	        return length;
	    }

	    private int buildStraight(int xo, int maxLength, boolean safe)
	    {
	        int length = random.nextInt(10) + 2;

	        if (safe)
	        	length = 10 + random.nextInt(5);

	        if (length > maxLength)
	        	length = maxLength;

	        int floor = height - 1 - random.nextInt(4);

	        //runs from the specified x position to the length of the segment
	        for (int x = xo; x < xo + length; x++)
	        {
	            for (int y = 0; y < height; y++)
	            {
	                if (y >= floor)
	                {
	                    setBlock(x, y, GROUND);
	                }
	            }
	        }

	        if (!safe)
	        {
	            if (length > 5)
	            {
	                decorate(xo, xo + length, floor);
	            }
	        }

	        return length;
	    }

	    private void decorate(int xStart, int xLength, int floor)
	    {
	    	//if its at the very top, just return
	        if (floor < 1)
	        	return;

	        //        boolean coins = random.nextInt(3) == 0;
	        boolean rocks = true;

	        //add an enemy line above the box
	        addEnemyLine(xStart + 1, xLength - 1, floor - 1);

	        int s = random.nextInt(4);
	        int e = random.nextInt(4);

	        if (floor - 2 > 0){
	            if ((xLength - 1 - e) - (xStart + 1 + s) > 1){
	                for(int x = xStart + 1 + s; x < xLength - 1 - e; x++){
	                    setBlock(x, floor - 2, COIN);
	                    COINS++;
	                }
	            }
	        }

	        s = random.nextInt(4);
	        e = random.nextInt(4);
	        
	        //this fills the set of blocks and the hidden objects inside them
	        if (floor - 4 > 0)
	        {
	            if ((xLength - 1 - e) - (xStart + 1 + s) > 2)
	            {
	                for (int x = xStart + 1 + s; x < xLength - 1 - e; x++)
	                {
	                    if (rocks)
	                    {
	                        if (x != xStart + 1 && x != xLength - 2 && random.nextInt(3) == 0)
	                        {
	                            if (random.nextInt(4) == 0)
	                            {
	                                setBlock(x, floor - 4, BLOCK_POWERUP);
	                                BLOCKS_POWER++;
	                            }
	                            else
	                            {	//the fills a block with a hidden coin
	                                setBlock(x, floor - 4, BLOCK_COIN);
	                                BLOCKS_COINS++;
	                            }
	                        }
	                        else if (random.nextInt(4) == 0)
	                        {
	                            if (random.nextInt(4) == 0)
	                            {
	                                setBlock(x, floor - 4, (byte) (2 + 1 * 16));
	                            }
	                            else
	                            {
	                                setBlock(x, floor - 4, (byte) (1 + 1 * 16));
	                            }
	                        }
	                        else
	                        {
	                            setBlock(x, floor - 4, BLOCK_EMPTY);
	                            BLOCKS_EMPTY++;
	                        }
	                    }
	                }
	            }
	        }
	    }

	    private void fixWalls()
	    {
	        boolean[][] blockMap = new boolean[width + 1][height + 1];

	        for (int x = 0; x < width + 1; x++)
	        {
	            for (int y = 0; y < height + 1; y++)
	            {
	                int blocks = 0;
	                for (int xx = x - 1; xx < x + 1; xx++)
	                {
	                    for (int yy = y - 1; yy < y + 1; yy++)
	                    {
	                        if (getBlockCapped(xx, yy) == GROUND){
	                        	blocks++;
	                        }
	                    }
	                }
	                blockMap[x][y] = blocks == 4;
	            }
	        }
	        blockify(this, blockMap, width + 1, height + 1);
	    }

	    private void blockify(Level level, boolean[][] blocks, int width, int height){
	        int to = 0;
	        if (type == LevelInterface.TYPE_CASTLE)
	        {
	            to = 4 * 2;
	        }
	        else if (type == LevelInterface.TYPE_UNDERGROUND)
	        {
	            to = 4 * 3;
	        }

	        boolean[][] b = new boolean[2][2];

	        for (int x = 0; x < width; x++)
	        {
	            for (int y = 0; y < height; y++)
	            {
	                for (int xx = x; xx <= x + 1; xx++)
	                {
	                    for (int yy = y; yy <= y + 1; yy++)
	                    {
	                        int _xx = xx;
	                        int _yy = yy;
	                        if (_xx < 0) _xx = 0;
	                        if (_yy < 0) _yy = 0;
	                        if (_xx > width - 1) _xx = width - 1;
	                        if (_yy > height - 1) _yy = height - 1;
	                        b[xx - x][yy - y] = blocks[_xx][_yy];
	                    }
	                }

	                if (b[0][0] == b[1][0] && b[0][1] == b[1][1])
	                {
	                    if (b[0][0] == b[0][1])
	                    {
	                        if (b[0][0])
	                        {
	                            level.setBlock(x, y, (byte) (1 + 9 * 16 + to));
	                        }
	                        else
	                        {
	                            // KEEP OLD BLOCK!
	                        }
	                    }
	                    else
	                    {
	                        if (b[0][0])
	                        {
	                        	//down grass top?
	                            level.setBlock(x, y, (byte) (1 + 10 * 16 + to));
	                        }
	                        else
	                        {
	                        	//up grass top
	                            level.setBlock(x, y, (byte) (1 + 8 * 16 + to));
	                        }
	                    }
	                }
	                else if (b[0][0] == b[0][1] && b[1][0] == b[1][1])
	                {
	                    if (b[0][0])
	                    {
	                    	//right grass top
	                        level.setBlock(x, y, (byte) (2 + 9 * 16 + to));
	                    }
	                    else
	                    {
	                    	//left grass top
	                        level.setBlock(x, y, (byte) (0 + 9 * 16 + to));
	                    }
	                }
	                else if (b[0][0] == b[1][1] && b[0][1] == b[1][0])
	                {
	                    level.setBlock(x, y, (byte) (1 + 9 * 16 + to));
	                }
	                else if (b[0][0] == b[1][0])
	                {
	                    if (b[0][0])
	                    {
	                        if (b[0][1])
	                        {
	                            level.setBlock(x, y, (byte) (3 + 10 * 16 + to));
	                        }
	                        else
	                        {
	                            level.setBlock(x, y, (byte) (3 + 11 * 16 + to));
	                        }
	                    }
	                    else
	                    {
	                        if (b[0][1])
	                        {
	                        	//right up grass top
	                            level.setBlock(x, y, (byte) (2 + 8 * 16 + to));
	                        }
	                        else
	                        {
	                        	//left up grass top
	                            level.setBlock(x, y, (byte) (0 + 8 * 16 + to));
	                        }
	                    }
	                }
	                else if (b[0][1] == b[1][1])
	                {
	                    if (b[0][1])
	                    {
	                        if (b[0][0])
	                        {
	                        	//left pocket grass
	                            level.setBlock(x, y, (byte) (3 + 9 * 16 + to));
	                        }
	                        else
	                        {
	                        	//right pocket grass
	                            level.setBlock(x, y, (byte) (3 + 8 * 16 + to));
	                        }
	                    }
	                    else
	                    {
	                        if (b[0][0])
	                        {
	                            level.setBlock(x, y, (byte) (2 + 10 * 16 + to));
	                        }
	                        else
	                        {
	                            level.setBlock(x, y, (byte) (0 + 10 * 16 + to));
	                        }
	                    }
	                }
	                else
	                {
	                    level.setBlock(x, y, (byte) (0 + 1 * 16 + to));
	                }
	            }
	        }
	    }
	    
	    public RandomLevel clone() throws CloneNotSupportedException {

	    	RandomLevel clone=new RandomLevel(width, height);

	    	clone.xExit = xExit;
	    	clone.yExit = yExit;
	    	byte[][] map = getMap();
	    	SpriteTemplate[][] st = getSpriteTemplate();
	    	
	    	for (int i = 0; i < map.length; i++)
	    		for (int j = 0; j < map[i].length; j++) {
	    			clone.setBlock(i, j, map[i][j]);
	    			clone.setSpriteTemplate(i, j, st[i][j]);
	    	}
	    	clone.BLOCKS_COINS = BLOCKS_COINS;
	    	clone.BLOCKS_EMPTY = BLOCKS_EMPTY;
	    	clone.BLOCKS_POWER = BLOCKS_POWER;
	    	clone.ENEMIES = ENEMIES;
	    	clone.COINS = COINS;
	    	
	        return clone;

	      }


}
