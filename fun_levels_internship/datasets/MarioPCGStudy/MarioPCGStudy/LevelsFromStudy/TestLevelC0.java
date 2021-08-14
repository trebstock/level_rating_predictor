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
public class TestLevelC0 extends Level{
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
		
		public TestLevelC0(int width, int height)
	    {
			super(width, height);
	    }


		public TestLevelC0(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
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
			setBlock(16, 11, ROCK);
			setBlock(16, 12, ROCK);
			setBlock(16, 9, ROCK);
			setBlock(17, 9, ROCK);
			setBlock(16, 10, ROCK);
			setBlock(17, 10, ROCK);
			setBlock(17, 11, ROCK);
			setBlock(17, 12, ROCK);
			setBlock(18, 9, ROCK);
			setBlock(18, 11, ROCK);
			setBlock(18, 12, ROCK);
			setBlock(15, 13, HILL_TOP);
			setBlock(15, 14, GROUND);
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
			setBlock(23, 11, TUBE_SIDE_LEFT);
			setBlock(24, 11, TUBE_SIDE_RIGHT);
			setBlock(23, 12, TUBE_SIDE_LEFT);
			setBlock(24, 12, TUBE_SIDE_RIGHT);
			setBlock(23, 10, TUBE_TOP_LEFT);
			setBlock(24, 10, TUBE_TOP_RIGHT);
			setSpriteTemplate(36, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(30, 9, BLOCK_COIN);
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
			setBlock(43, 11, ROCK);
			setBlock(43, 10, ROCK);
			setBlock(45, 9, ROCK);
			setBlock(45, 11, ROCK);
			setBlock(45, 10, ROCK);
			setBlock(47, 8, ROCK);
			setBlock(47, 9, ROCK);
			setBlock(47, 10, ROCK);
			setBlock(47, 11, ROCK);
			setBlock(47, 6, ROCK);
			setBlock(47, 7, ROCK);
			setBlock(48, 5, ROCK);
			setBlock(49, 5, ROCK);
			setBlock(48, 9, ROCK);
			setBlock(49, 9, ROCK);
			setBlock(49, 6, ROCK);
			setBlock(49, 7, ROCK);
			setBlock(49, 10, ROCK);
			setBlock(49, 11, ROCK);
			setBlock(49, 8, ROCK);
			setBlock(41, 13, HILL_TOP);
			setBlock(41, 14, GROUND);
			setBlock(42, 13, HILL_TOP);
			setBlock(42, 14, GROUND);
			setBlock(43, 13, HILL_TOP);
			setBlock(43, 14, GROUND);
			setBlock(44, 13, HILL_TOP);
			setBlock(44, 14, GROUND);
			setBlock(38, 12, TUBE_SIDE_LEFT);
			setBlock(39, 12, TUBE_SIDE_RIGHT);
			setBlock(38, 11, TUBE_TOP_LEFT);
			setBlock(39, 11, TUBE_TOP_RIGHT);
			setBlock(58, 11, ROCK);
			setBlock(58, 10, ROCK);
			setBlock(60, 9, ROCK);
			setBlock(60, 11, ROCK);
			setBlock(60, 10, ROCK);
			setBlock(62, 8, ROCK);
			setBlock(62, 9, ROCK);
			setBlock(62, 10, ROCK);
			setBlock(62, 11, ROCK);
			setBlock(62, 6, ROCK);
			setBlock(62, 7, ROCK);
			setBlock(63, 5, ROCK);
			setBlock(64, 5, ROCK);
			setBlock(63, 9, ROCK);
			setBlock(64, 9, ROCK);
			setBlock(64, 6, ROCK);
			setBlock(64, 7, ROCK);
			setBlock(64, 10, ROCK);
			setBlock(64, 11, ROCK);
			setBlock(64, 8, ROCK);
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
			setBlock(53, 12, TUBE_SIDE_LEFT);
			setBlock(54, 12, TUBE_SIDE_RIGHT);
			setBlock(53, 11, TUBE_TOP_LEFT);
			setBlock(54, 11, TUBE_TOP_RIGHT);
			setBlock(66, 13, HILL_TOP);
			setBlock(66, 14, GROUND);
			setBlock(69, 6, BLOCK_EMPTY);
			setBlock(69, 12, ROCK);
			setBlock(70, 11, ROCK);
			setBlock(70, 12, ROCK);
			setBlock(71, 12, ROCK);
			setBlock(71, 10, ROCK);
			setBlock(71, 11, ROCK);
			setBlock(72, 11, ROCK);
			setBlock(72, 12, ROCK);
			setBlock(72, 9, ROCK);
			setBlock(72, 10, ROCK);
			setBlock(73, 10, ROCK);
			setBlock(73, 11, ROCK);
			setBlock(73, 8, ROCK);
			setBlock(74, 8, ROCK);
			setBlock(73, 9, ROCK);
			setBlock(74, 9, ROCK);
			setBlock(73, 12, ROCK);
			setBlock(74, 10, ROCK);
			setBlock(74, 11, ROCK);
			setBlock(74, 12, ROCK);
			setBlock(74, 7, ROCK);
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
			setBlock(80, 13, HILL_TOP);
			setBlock(80, 14, GROUND);
			setBlock(81, 13, HILL_TOP);
			setBlock(81, 14, GROUND);
			setBlock(64, 8, BLOCK_EMPTY);
			setBlock(90, 11, ROCK);
			setBlock(90, 12, ROCK);
			setBlock(91, 12, ROCK);
			setBlock(91, 10, ROCK);
			setBlock(91, 11, ROCK);
			setBlock(92, 10, ROCK);
			setBlock(92, 11, ROCK);
			setBlock(92, 12, ROCK);
			setBlock(92, 9, ROCK);
			setBlock(93, 9, ROCK);
			setBlock(93, 10, ROCK);
			setBlock(93, 11, ROCK);
			setBlock(93, 12, ROCK);
			setBlock(93, 8, ROCK);
			setBlock(94, 8, ROCK);
			setBlock(94, 9, ROCK);
			setBlock(94, 10, ROCK);
			setBlock(94, 11, ROCK);
			setBlock(94, 12, ROCK);
			setBlock(94, 7, ROCK);
			setSpriteTemplate(89, 11, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(82, 5, BLOCK_EMPTY);
			setBlock(83, 5, BLOCK_EMPTY);
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
			setBlock(91, 13, HILL_TOP);
			setBlock(91, 14, GROUND);
			setBlock(92, 13, HILL_TOP);
			setBlock(92, 14, GROUND);
			setBlock(93, 13, HILL_TOP);
			setBlock(93, 14, GROUND);
			setBlock(95, 11, ROCK);
			setBlock(95, 12, ROCK);
			setBlock(96, 12, ROCK);
			setBlock(96, 10, ROCK);
			setBlock(96, 11, ROCK);
			setBlock(97, 10, ROCK);
			setBlock(97, 11, ROCK);
			setBlock(97, 12, ROCK);
			setBlock(95, 9, ROCK);
			setBlock(95, 10, ROCK);
			setBlock(96, 9, ROCK);
			setBlock(97, 8, ROCK);
			setBlock(97, 9, ROCK);
			setBlock(98, 8, ROCK);
			setBlock(98, 9, ROCK);
			setBlock(98, 10, ROCK);
			setBlock(98, 11, ROCK);
			setBlock(98, 12, ROCK);
			setBlock(97, 7, ROCK);
			setBlock(98, 7, ROCK);
			setBlock(99, 6, ROCK);
			setBlock(99, 7, ROCK);
			setBlock(99, 8, ROCK);
			setBlock(99, 9, ROCK);
			setBlock(99, 10, ROCK);
			setBlock(99, 11, ROCK);
			setBlock(99, 12, ROCK);
			setBlock(100, 9, ROCK);
			setBlock(100, 12, ROCK);
			setBlock(98, 6, ROCK);
			setBlock(100, 6, ROCK);
			setBlock(100, 7, ROCK);
			setBlock(100, 8, ROCK);
			setBlock(100, 10, ROCK);
			setBlock(100, 11, ROCK);
			setBlock(101, 7, BLOCK_EMPTY);
			setBlock(102, 7, BLOCK_EMPTY);
			setBlock(94, 13, HILL_TOP);
			setBlock(94, 14, GROUND);
			setBlock(95, 13, HILL_TOP);
			setBlock(95, 14, GROUND);
			setBlock(96, 13, HILL_TOP);
			setBlock(96, 14, GROUND);
			setBlock(97, 13, HILL_TOP);
			setBlock(97, 14, GROUND);
			setBlock(98, 13, HILL_TOP);
			setBlock(98, 14, GROUND);
			setBlock(99, 13, HILL_TOP);
			setBlock(99, 14, GROUND);
			setBlock(98, 14, ROCK);
			setBlock(99, 14, ROCK);
			setBlock(99, 13, ROCK);
			setBlock(99, 11, TUBE_SIDE_LEFT);
			setBlock(100, 11, TUBE_SIDE_RIGHT);
			setBlock(99, 12, TUBE_SIDE_LEFT);
			setBlock(100, 12, TUBE_SIDE_RIGHT);
			setBlock(99, 13, TUBE_SIDE_LEFT);
			setBlock(100, 13, TUBE_SIDE_RIGHT);
			setBlock(99, 10, TUBE_TOP_LEFT);
			setBlock(100, 10, TUBE_TOP_RIGHT);
			setBlock(96, 13, HILL_TOP);
			setBlock(96, 14, GROUND);
			setBlock(98, 13, ROCK);
			setBlock(97, 13, HILL_TOP);
			setBlock(97, 14, GROUND);
			setBlock(98, 13, HILL_TOP);
			setBlock(98, 14, GROUND);
			setBlock(99, 13, HILL_TOP);
			setBlock(99, 14, GROUND);
			setBlock(100, 13, HILL_TOP);
			setBlock(100, 14, GROUND);
			setBlock(101, 13, HILL_TOP);
			setBlock(101, 14, GROUND);
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
			setBlock(110, 13, HILL_TOP);
			setBlock(110, 14, GROUND);
			setBlock(102, 11, ROCK);
			setBlock(102, 12, ROCK);
			setBlock(103, 11, ROCK);
			setBlock(103, 12, ROCK);
			setBlock(104, 10, ROCK);
			setBlock(104, 11, ROCK);
			setBlock(104, 12, ROCK);
			setBlock(105, 9, ROCK);
			setBlock(105, 10, ROCK);
			setBlock(105, 11, ROCK);
			setBlock(105, 12, ROCK);
			setBlock(105, 8, ROCK);
			setBlock(106, 8, ROCK);
			setBlock(106, 9, ROCK);
			setBlock(106, 11, ROCK);
			setBlock(106, 12, ROCK);
			setBlock(106, 10, ROCK);
			setBlock(106, 7, ROCK);
			setBlock(107, 7, ROCK);
			setBlock(107, 9, ROCK);
			setBlock(107, 10, ROCK);
			setBlock(107, 11, ROCK);
			setBlock(107, 8, ROCK);
			setBlock(107, 12, ROCK);
			setBlock(107, 6, ROCK);
			setBlock(108, 6, ROCK);
			setBlock(108, 7, ROCK);
			setBlock(108, 8, ROCK);
			setBlock(108, 9, ROCK);
			setBlock(108, 10, ROCK);
			setBlock(108, 11, ROCK);
			setBlock(109, 9, ROCK);
			setBlock(108, 5, ROCK);
			setBlock(109, 5, ROCK);
			setBlock(109, 6, ROCK);
			setBlock(109, 7, ROCK);
			setBlock(109, 8, ROCK);
			setBlock(109, 10, ROCK);
			setBlock(109, 11, ROCK);
			setBlock(109, 12, ROCK);
			setBlock(112, 11, ROCK);
			setBlock(112, 12, ROCK);
			setBlock(113, 11, ROCK);
			setBlock(113, 12, ROCK);
			setBlock(113, 10, ROCK);
			setBlock(114, 10, ROCK);
			setBlock(114, 11, ROCK);
			setBlock(114, 12, ROCK);
			setBlock(115, 10, ROCK);
			setBlock(114, 9, ROCK);
			setBlock(115, 9, ROCK);
			setBlock(115, 11, ROCK);
			setBlock(115, 12, ROCK);
			setBlock(116, 9, ROCK);
			setBlock(116, 10, ROCK);
			setBlock(116, 11, ROCK);
			setBlock(116, 12, ROCK);
			setBlock(116, 7, ROCK);
			setBlock(116, 8, ROCK);
			setBlock(117, 9, ROCK);
			setBlock(117, 10, ROCK);
			setBlock(117, 12, ROCK);
			setBlock(117, 8, ROCK);
			setBlock(117, 11, ROCK);
			setBlock(118, 10, ROCK);
			setBlock(118, 11, ROCK);
			setBlock(118, 12, ROCK);
			setBlock(118, 8, ROCK);
			setBlock(118, 9, ROCK);
			setBlock(117, 6, ROCK);
			setBlock(117, 7, ROCK);
			setBlock(118, 6, ROCK);
			setBlock(118, 7, ROCK);
			setBlock(119, 7, BLOCK_EMPTY);
			setBlock(120, 7, BLOCK_EMPTY);
			setBlock(113, 13, HILL_TOP);
			setBlock(113, 14, GROUND);
			setBlock(114, 13, HILL_TOP);
			setBlock(114, 14, GROUND);
			setBlock(115, 13, HILL_TOP);
			setBlock(115, 14, GROUND);
			setBlock(116, 13, HILL_TOP);
			setBlock(116, 14, GROUND);
			setBlock(117, 13, HILL_TOP);
			setBlock(117, 14, GROUND);
			setBlock(118, 13, HILL_TOP);
			setBlock(118, 14, GROUND);
			setBlock(124, 8, BLOCK_COIN);
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
			setSpriteTemplate(141, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(137, 11, ROCK);
			setBlock(137, 12, ROCK);
			setBlock(137, 10, ROCK);
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
			setBlock(140, 13, HILL_TOP);
			setBlock(140, 14, GROUND);
			setBlock(141, 13, HILL_TOP);
			setBlock(141, 14, GROUND);
			setBlock(142, 13, HILL_TOP);
			setBlock(142, 14, GROUND);
			setBlock(143, 13, HILL_TOP);
			setBlock(143, 14, GROUND);
			setBlock(144, 13, HILL_TOP);
			setBlock(144, 14, GROUND);
			setBlock(147, 12, ROCK);
			setBlock(145, 13, HILL_TOP);
			setBlock(145, 14, GROUND);
			setBlock(146, 13, HILL_TOP);
			setBlock(146, 14, GROUND);
			setBlock(147, 13, HILL_TOP);
			setBlock(147, 14, GROUND);
			setBlock(148, 13, HILL_TOP);
			setBlock(148, 14, GROUND);
			setBlock(149, 13, HILL_TOP);
			setBlock(149, 14, GROUND);
			setBlock(150, 13, HILL_TOP);
			setBlock(150, 14, GROUND);
			setBlock(151, 13, HILL_TOP);
			setBlock(151, 14, GROUND);
			setBlock(152, 13, HILL_TOP);
			setBlock(152, 14, GROUND);
			setBlock(153, 13, HILL_TOP);
			setBlock(153, 14, GROUND);
			setBlock(154, 13, HILL_TOP);
			setBlock(154, 14, GROUND);
			setBlock(155, 13, HILL_TOP);
			setBlock(155, 14, GROUND);
			setBlock(156, 13, HILL_TOP);
			setBlock(156, 14, GROUND);
			setBlock(157, 13, HILL_TOP);
			setBlock(157, 14, GROUND);
			setBlock(158, 13, HILL_TOP);
			setBlock(158, 14, GROUND);
			setBlock(18, 10, ROCK);
			setBlock(44, 11, ROCK);
			setBlock(44, 10, ROCK);
			setBlock(46, 9, ROCK);
			setBlock(46, 11, ROCK);
			setBlock(46, 10, ROCK);
			setBlock(48, 8, ROCK);
			setBlock(48, 10, ROCK);
			setBlock(48, 11, ROCK);
			setBlock(48, 6, ROCK);
			setBlock(48, 7, ROCK);
			setBlock(59, 11, ROCK);
			setBlock(59, 10, ROCK);
			setBlock(61, 9, ROCK);
			setBlock(61, 11, ROCK);
			setBlock(61, 10, ROCK);
			setBlock(63, 8, ROCK);
			setBlock(63, 10, ROCK);
			setBlock(63, 11, ROCK);
			setBlock(63, 6, ROCK);
			setBlock(63, 7, ROCK);
			setBlock(67, 13, HILL_TOP);
			setBlock(67, 14, GROUND);
			setBlock(108, 12, ROCK);
			xExit = 146;
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
