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
public class TestLevelB9 extends Level{
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
		
		public TestLevelB9(int width, int height)
	    {
			super(width, height);
	    }


		public TestLevelB9(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
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

			
			setBlock(43, 2, Level.BLOCK_COIN);
			setBlock(186, 2, Level.BLOCK_COIN);
			setBlock(138, 4, Level.BLOCK_COIN);
			setBlock(66, 8, Level.ROCK);
			setBlock(67, 8, Level.ROCK);
			setBlock(68, 8, Level.BLOCK_EMPTY);
			setBlock(101, 8, Level.ROCK);
			setBlock(20, 9, Level.BLOCK_COIN);
			setBlock(21, 9, Level.BLOCK_EMPTY);
			setBlock(22, 9, Level.BLOCK_EMPTY);
			setBlock(101, 9, Level.ROCK);
			setBlock(141, 9, Level.BLOCK_EMPTY);
			setSpriteTemplate(42, 10, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(101, 10, Level.ROCK);
			setBlock(102, 10, Level.ROCK);
			setBlock(170, 10, Level.ROCK);
			setBlock(190, 10, Level.BLOCK_EMPTY);
			setBlock(191, 10, Level.BLOCK_EMPTY);
			setBlock(9, 11, Level.TUBE_TOP_LEFT);
			setBlock(10, 11, Level.TUBE_TOP_RIGHT);
			setBlock(33, 11, Level.TUBE_TOP_LEFT);
			setBlock(34, 11, Level.TUBE_TOP_RIGHT);
			setBlock(36, 11, Level.ROCK);
			setBlock(37, 11, Level.ROCK);
			setBlock(38, 11, Level.ROCK);
			setBlock(39, 11, Level.ROCK);
			setBlock(40, 11, Level.ROCK);
			setBlock(41, 11, Level.ROCK);
			setBlock(42, 11, Level.ROCK);
			setBlock(43, 11, Level.ROCK);
			setBlock(46, 11, Level.TUBE_TOP_LEFT);
			setBlock(47, 11, Level.TUBE_TOP_RIGHT);
			setSpriteTemplate(53, 11, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(82, 11, Level.TUBE_TOP_LEFT);
			setBlock(83, 11, Level.TUBE_TOP_RIGHT);
			setBlock(97, 11, Level.ROCK);
			setBlock(98, 11, Level.ROCK);
			setBlock(99, 11, Level.ROCK);
			setBlock(100, 11, Level.ROCK);
			setBlock(101, 11, Level.ROCK);
			setBlock(102, 11, Level.ROCK);
			setBlock(109, 11, Level.TUBE_TOP_LEFT);
			setBlock(110, 11, Level.TUBE_TOP_RIGHT);
			setBlock(111, 11, Level.TUBE_TOP_LEFT);
			setBlock(112, 11, Level.TUBE_TOP_RIGHT);
			setBlock(151, 11, Level.TUBE_TOP_LEFT);
			setBlock(152, 11, Level.TUBE_TOP_RIGHT);
			setBlock(166, 11, Level.TUBE_TOP_LEFT);
			setBlock(167, 11, Level.TUBE_TOP_RIGHT);
			setBlock(170, 11, Level.ROCK);
			setBlock(171, 11, Level.ROCK);
			setBlock(9, 12, Level.TUBE_SIDE_LEFT);
			setBlock(10, 12, Level.TUBE_SIDE_RIGHT);
			setBlock(33, 12, Level.TUBE_SIDE_LEFT);
			setBlock(34, 12, Level.TUBE_SIDE_RIGHT);
			setBlock(36, 12, Level.ROCK);
			setBlock(37, 12, Level.ROCK);
			setBlock(38, 12, Level.ROCK);
			setBlock(39, 12, Level.ROCK);
			setBlock(40, 12, Level.ROCK);
			setBlock(41, 12, Level.ROCK);
			setBlock(42, 12, Level.ROCK);
			setBlock(43, 12, Level.ROCK);
			setBlock(44, 12, Level.ROCK);
			setBlock(45, 12, Level.ROCK);
			setBlock(46, 12, Level.ROCK);
			setBlock(47, 12, Level.ROCK);
			setBlock(48, 12, Level.ROCK);
			setBlock(49, 12, Level.ROCK);
			setBlock(50, 12, Level.ROCK);
			setBlock(51, 12, Level.ROCK);
			setBlock(52, 12, Level.ROCK);
			setBlock(53, 12, Level.ROCK);
			setBlock(54, 12, Level.ROCK);
			setBlock(55, 12, Level.ROCK);
			setBlock(56, 12, Level.ROCK);
			setBlock(57, 12, Level.ROCK);
			setBlock(58, 12, Level.ROCK);
			setBlock(59, 12, Level.ROCK);
			setBlock(60, 12, Level.ROCK);
			setBlock(82, 12, Level.TUBE_SIDE_LEFT);
			setBlock(83, 12, Level.TUBE_SIDE_RIGHT);
			setSpriteTemplate(86, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setSpriteTemplate(87, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(93, 12, Level.ROCK);
			setBlock(94, 12, Level.ROCK);
			setBlock(95, 12, Level.ROCK);
			setBlock(96, 12, Level.ROCK);
			setBlock(97, 12, Level.ROCK);
			setBlock(98, 12, Level.ROCK);
			setBlock(99, 12, Level.ROCK);
			setBlock(100, 12, Level.ROCK);
			setBlock(101, 12, Level.ROCK);
			setBlock(102, 12, Level.ROCK);
			setBlock(103, 12, Level.ROCK);
			setBlock(104, 12, Level.ROCK);
			setBlock(105, 12, Level.ROCK);
			setBlock(106, 12, Level.ROCK);
			setBlock(107, 12, Level.ROCK);
			setBlock(108, 12, Level.ROCK);
			setBlock(109, 12, Level.ROCK);
			setBlock(110, 12, Level.ROCK);
			setBlock(111, 12, Level.ROCK);
			setBlock(112, 12, Level.ROCK);
			setBlock(113, 12, Level.ROCK);
			setSpriteTemplate(133, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setSpriteTemplate(134, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(145, 12, Level.ROCK);
			setBlock(146, 12, Level.ROCK);
			setBlock(147, 12, Level.ROCK);
			setBlock(148, 12, Level.ROCK);
			setBlock(149, 12, Level.ROCK);
			setBlock(151, 12, Level.TUBE_SIDE_LEFT);
			setBlock(152, 12, Level.TUBE_SIDE_RIGHT);
			setSpriteTemplate(161, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(166, 12, Level.TUBE_SIDE_LEFT);
			setBlock(167, 12, Level.TUBE_SIDE_RIGHT);
			setBlock(170, 12, Level.ROCK);
			setBlock(171, 12, Level.ROCK);
			setBlock(172, 12, Level.ROCK);
			setBlock(173, 12, Level.ROCK);
			setBlock(174, 12, Level.ROCK);
			setBlock(175, 12, Level.ROCK);
			setBlock(176, 12, Level.ROCK);
			setBlock(177, 12, Level.ROCK);
			setBlock(178, 12, Level.ROCK);
			setBlock(179, 12, Level.ROCK);
			setBlock(180, 12, Level.ROCK);
			setBlock(182, 12, Level.ROCK);
			setSpriteTemplate(190, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setSpriteTemplate(191, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(0, 13, Level.HILL_TOP);
			setBlock(0, 14, Level.GROUND);
			setBlock(1, 13, Level.HILL_TOP);
			setBlock(1, 14, Level.GROUND);
			setBlock(2, 13, Level.HILL_TOP);
			setBlock(2, 14, Level.GROUND);
			setBlock(3, 13, Level.HILL_TOP);
			setBlock(3, 14, Level.GROUND);
			setBlock(4, 13, Level.HILL_TOP);
			setBlock(4, 14, Level.GROUND);
			setBlock(5, 13, Level.HILL_TOP);
			setBlock(5, 14, Level.GROUND);
			setBlock(6, 13, Level.HILL_TOP);
			setBlock(6, 14, Level.GROUND);
			setBlock(7, 13, Level.HILL_TOP);
			setBlock(7, 14, Level.GROUND);
			setBlock(8, 13, Level.HILL_TOP);
			setBlock(8, 14, Level.GROUND);
			setBlock(9, 13, Level.HILL_TOP);
			setBlock(9, 14, Level.GROUND);
			setBlock(10, 13, Level.HILL_TOP);
			setBlock(10, 14, Level.GROUND);
			setBlock(11, 13, Level.HILL_TOP);
			setBlock(11, 14, Level.GROUND);
			setBlock(12, 13, Level.HILL_TOP);
			setBlock(12, 14, Level.GROUND);
			setBlock(13, 13, Level.HILL_TOP);
			setBlock(13, 14, Level.GROUND);
			setBlock(14, 13, Level.HILL_TOP);
			setBlock(14, 14, Level.GROUND);
			setBlock(15, 13, Level.HILL_TOP);
			setBlock(15, 14, Level.GROUND);
			setBlock(16, 13, Level.HILL_TOP);
			setBlock(16, 14, Level.GROUND);
			setBlock(17, 13, Level.HILL_TOP);
			setBlock(17, 14, Level.GROUND);
			setBlock(18, 13, Level.HILL_TOP);
			setBlock(18, 14, Level.GROUND);
			setBlock(19, 13, Level.HILL_TOP);
			setBlock(19, 14, Level.GROUND);
			setBlock(20, 13, Level.HILL_TOP);
			setBlock(20, 14, Level.GROUND);
			setBlock(21, 13, Level.HILL_TOP);
			setBlock(21, 14, Level.GROUND);
			setBlock(22, 13, Level.HILL_TOP);
			setBlock(22, 14, Level.GROUND);
			setBlock(23, 13, Level.HILL_TOP);
			setBlock(23, 14, Level.GROUND);
			setBlock(24, 13, Level.HILL_TOP);
			setBlock(24, 14, Level.GROUND);
			setBlock(25, 13, Level.HILL_TOP);
			setBlock(25, 14, Level.GROUND);
			setBlock(26, 13, Level.HILL_TOP);
			setBlock(26, 14, Level.GROUND);
			setBlock(27, 13, Level.HILL_TOP);
			setBlock(27, 14, Level.GROUND);
			setBlock(28, 13, Level.HILL_TOP);
			setBlock(28, 14, Level.GROUND);
			setBlock(29, 13, Level.HILL_TOP);
			setBlock(29, 14, Level.GROUND);
			setBlock(30, 13, Level.HILL_TOP);
			setBlock(30, 14, Level.GROUND);
			setBlock(31, 13, Level.HILL_TOP);
			setBlock(31, 14, Level.GROUND);
			setBlock(32, 13, Level.HILL_TOP);
			setBlock(32, 14, Level.GROUND);
			setBlock(33, 13, Level.HILL_TOP);
			setBlock(33, 14, Level.GROUND);
			setBlock(34, 13, Level.HILL_TOP);
			setBlock(34, 14, Level.GROUND);
			setBlock(35, 13, Level.HILL_TOP);
			setBlock(35, 14, Level.GROUND);
			setBlock(36, 13, Level.HILL_TOP);
			setBlock(36, 14, Level.GROUND);
			setBlock(37, 13, Level.HILL_TOP);
			setBlock(37, 14, Level.GROUND);
			setBlock(38, 13, Level.HILL_TOP);
			setBlock(38, 14, Level.GROUND);
			setBlock(39, 13, Level.HILL_TOP);
			setBlock(39, 14, Level.GROUND);
			setBlock(40, 13, Level.HILL_TOP);
			setBlock(40, 14, Level.GROUND);
			setBlock(41, 13, Level.HILL_TOP);
			setBlock(41, 14, Level.GROUND);
			setBlock(42, 13, Level.HILL_TOP);
			setBlock(42, 14, Level.GROUND);
			setBlock(43, 13, Level.HILL_TOP);
			setBlock(43, 14, Level.GROUND);
			setBlock(44, 13, Level.HILL_TOP);
			setBlock(44, 14, Level.GROUND);
			setBlock(45, 13, Level.HILL_TOP);
			setBlock(45, 14, Level.GROUND);
			setBlock(46, 13, Level.HILL_TOP);
			setBlock(46, 14, Level.GROUND);
			setBlock(47, 13, Level.HILL_TOP);
			setBlock(47, 14, Level.GROUND);
			setBlock(48, 13, Level.HILL_TOP);
			setBlock(48, 14, Level.GROUND);
			setBlock(49, 13, Level.HILL_TOP);
			setBlock(49, 14, Level.GROUND);
			setBlock(50, 13, Level.HILL_TOP);
			setBlock(50, 14, Level.GROUND);
			setBlock(51, 13, Level.HILL_TOP);
			setBlock(51, 14, Level.GROUND);
			setBlock(52, 13, Level.HILL_TOP);
			setBlock(52, 14, Level.GROUND);
			setBlock(53, 13, Level.HILL_TOP);
			setBlock(53, 14, Level.GROUND);
			setBlock(54, 13, Level.HILL_TOP);
			setBlock(54, 14, Level.GROUND);
			setBlock(55, 13, Level.HILL_TOP);
			setBlock(55, 14, Level.GROUND);
			setBlock(56, 13, Level.HILL_TOP);
			setBlock(56, 14, Level.GROUND);
			setBlock(57, 13, Level.HILL_TOP);
			setBlock(57, 14, Level.GROUND);
			setBlock(58, 13, Level.HILL_TOP);
			setBlock(58, 14, Level.GROUND);
			setBlock(59, 13, Level.HILL_TOP);
			setBlock(59, 14, Level.GROUND);
			setBlock(60, 13, Level.HILL_TOP);
			setBlock(60, 14, Level.GROUND);
			setBlock(61, 13, Level.HILL_TOP);
			setBlock(61, 14, Level.GROUND);
			setBlock(62, 13, Level.HILL_TOP);
			setBlock(62, 14, Level.GROUND);
			setBlock(63, 13, Level.HILL_TOP);
			setBlock(63, 14, Level.GROUND);
			setBlock(64, 13, Level.HILL_TOP);
			setBlock(64, 14, Level.GROUND);
			setBlock(65, 13, Level.HILL_TOP);
			setBlock(65, 14, Level.GROUND);
			setBlock(66, 13, Level.HILL_TOP);
			setBlock(66, 14, Level.GROUND);
			setBlock(67, 13, Level.HILL_TOP);
			setBlock(67, 14, Level.GROUND);
			setBlock(68, 13, Level.HILL_TOP);
			setBlock(68, 14, Level.GROUND);
			setBlock(69, 13, Level.HILL_TOP);
			setBlock(69, 14, Level.GROUND);
			setBlock(70, 13, Level.HILL_TOP);
			setBlock(70, 14, Level.GROUND);
			setBlock(71, 13, Level.HILL_TOP);
			setBlock(71, 14, Level.GROUND);
			setBlock(72, 13, Level.HILL_TOP);
			setBlock(72, 14, Level.GROUND);
			setBlock(73, 13, Level.HILL_TOP);
			setBlock(73, 14, Level.GROUND);
			setBlock(74, 13, Level.HILL_TOP);
			setBlock(74, 14, Level.GROUND);
			setBlock(75, 13, Level.HILL_TOP);
			setBlock(75, 14, Level.GROUND);
			setBlock(76, 13, Level.HILL_TOP);
			setBlock(76, 14, Level.GROUND);
			setBlock(77, 13, Level.HILL_TOP);
			setBlock(77, 14, Level.GROUND);
			setBlock(78, 13, Level.HILL_TOP);
			setBlock(78, 14, Level.GROUND);
			setBlock(79, 13, Level.HILL_TOP);
			setBlock(79, 14, Level.GROUND);
			setBlock(80, 13, Level.HILL_TOP);
			setBlock(80, 14, Level.GROUND);
			setBlock(81, 13, Level.HILL_TOP);
			setBlock(81, 14, Level.GROUND);
			setBlock(82, 13, Level.HILL_TOP);
			setBlock(82, 14, Level.GROUND);
			setBlock(83, 13, Level.HILL_TOP);
			setBlock(83, 14, Level.GROUND);
			setBlock(84, 13, Level.HILL_TOP);
			setBlock(84, 14, Level.GROUND);
			setBlock(85, 13, Level.HILL_TOP);
			setBlock(85, 14, Level.GROUND);
			setBlock(86, 13, Level.HILL_TOP);
			setBlock(86, 14, Level.GROUND);
			setBlock(87, 13, Level.HILL_TOP);
			setBlock(87, 14, Level.GROUND);
			setBlock(88, 13, Level.HILL_TOP);
			setBlock(88, 14, Level.GROUND);
			setBlock(89, 13, Level.HILL_TOP);
			setBlock(89, 14, Level.GROUND);
			setBlock(90, 13, Level.HILL_TOP);
			setBlock(90, 14, Level.GROUND);
			setBlock(91, 13, Level.HILL_TOP);
			setBlock(91, 14, Level.GROUND);
			setBlock(92, 13, Level.HILL_TOP);
			setBlock(92, 14, Level.GROUND);
			setBlock(93, 13, Level.HILL_TOP);
			setBlock(93, 14, Level.GROUND);
			setBlock(94, 13, Level.HILL_TOP);
			setBlock(94, 14, Level.GROUND);
			setBlock(95, 13, Level.HILL_TOP);
			setBlock(95, 14, Level.GROUND);
			setBlock(96, 13, Level.HILL_TOP);
			setBlock(96, 14, Level.GROUND);
			setBlock(97, 13, Level.HILL_TOP);
			setBlock(97, 14, Level.GROUND);
			setBlock(98, 13, Level.HILL_TOP);
			setBlock(98, 14, Level.GROUND);
			setBlock(99, 13, Level.HILL_TOP);
			setBlock(99, 14, Level.GROUND);
			setBlock(100, 13, Level.HILL_TOP);
			setBlock(100, 14, Level.GROUND);
			setBlock(101, 13, Level.HILL_TOP);
			setBlock(101, 14, Level.GROUND);
			setBlock(102, 13, Level.HILL_TOP);
			setBlock(102, 14, Level.GROUND);
			setBlock(103, 13, Level.HILL_TOP);
			setBlock(103, 14, Level.GROUND);
			setBlock(104, 13, Level.HILL_TOP);
			setBlock(104, 14, Level.GROUND);
			setBlock(105, 13, Level.HILL_TOP);
			setBlock(105, 14, Level.GROUND);
			setBlock(106, 13, Level.HILL_TOP);
			setBlock(106, 14, Level.GROUND);
			setBlock(107, 13, Level.HILL_TOP);
			setBlock(107, 14, Level.GROUND);
			setBlock(108, 13, Level.HILL_TOP);
			setBlock(108, 14, Level.GROUND);
			setBlock(109, 13, Level.HILL_TOP);
			setBlock(109, 14, Level.GROUND);
			setBlock(110, 13, Level.HILL_TOP);
			setBlock(110, 14, Level.GROUND);
			setBlock(111, 13, Level.HILL_TOP);
			setBlock(111, 14, Level.GROUND);
			setBlock(112, 13, Level.HILL_TOP);
			setBlock(112, 14, Level.GROUND);
			setBlock(113, 13, Level.HILL_TOP);
			setBlock(113, 14, Level.GROUND);
			setBlock(114, 13, Level.HILL_TOP);
			setBlock(114, 14, Level.GROUND);
			setBlock(115, 13, Level.HILL_TOP);
			setBlock(115, 14, Level.GROUND);
			setBlock(119, 13, Level.HILL_TOP);
			setBlock(119, 14, Level.GROUND);
			setBlock(120, 13, Level.HILL_TOP);
			setBlock(120, 14, Level.GROUND);
			setBlock(122, 13, Level.HILL_TOP);
			setBlock(122, 14, Level.GROUND);
			setBlock(123, 13, Level.HILL_TOP);
			setBlock(123, 14, Level.GROUND);
			setBlock(124, 13, Level.HILL_TOP);
			setBlock(124, 14, Level.GROUND);
			setBlock(125, 13, Level.HILL_TOP);
			setBlock(125, 14, Level.GROUND);
			setBlock(128, 13, Level.HILL_TOP);
			setBlock(128, 14, Level.GROUND);
			setBlock(129, 13, Level.HILL_TOP);
			setBlock(129, 14, Level.GROUND);
			setBlock(130, 13, Level.HILL_TOP);
			setBlock(130, 14, Level.GROUND);
			setBlock(131, 13, Level.HILL_TOP);
			setBlock(131, 14, Level.GROUND);
			setBlock(132, 13, Level.HILL_TOP);
			setBlock(132, 14, Level.GROUND);
			setBlock(133, 13, Level.HILL_TOP);
			setBlock(133, 14, Level.GROUND);
			setBlock(134, 13, Level.HILL_TOP);
			setBlock(134, 14, Level.GROUND);
			setBlock(135, 13, Level.HILL_TOP);
			setBlock(135, 14, Level.GROUND);
			setBlock(136, 13, Level.HILL_TOP);
			setBlock(136, 14, Level.GROUND);
			setBlock(137, 13, Level.HILL_TOP);
			setBlock(137, 14, Level.GROUND);
			setBlock(138, 13, Level.HILL_TOP);
			setBlock(138, 14, Level.GROUND);
			setBlock(139, 13, Level.HILL_TOP);
			setBlock(139, 14, Level.GROUND);
			setBlock(140, 13, Level.HILL_TOP);
			setBlock(140, 14, Level.GROUND);
			setBlock(141, 13, Level.HILL_TOP);
			setBlock(141, 14, Level.GROUND);
			setBlock(142, 13, Level.HILL_TOP);
			setBlock(142, 14, Level.GROUND);
			setBlock(143, 13, Level.HILL_TOP);
			setBlock(143, 14, Level.GROUND);
			setBlock(144, 13, Level.HILL_TOP);
			setBlock(144, 14, Level.GROUND);
			setBlock(145, 13, Level.HILL_TOP);
			setBlock(145, 14, Level.GROUND);
			setBlock(146, 13, Level.HILL_TOP);
			setBlock(146, 14, Level.GROUND);
			setBlock(147, 13, Level.HILL_TOP);
			setBlock(147, 14, Level.GROUND);
			setBlock(148, 13, Level.HILL_TOP);
			setBlock(148, 14, Level.GROUND);
			setBlock(149, 13, Level.HILL_TOP);
			setBlock(149, 14, Level.GROUND);
			setBlock(150, 13, Level.HILL_TOP);
			setBlock(150, 14, Level.GROUND);
			setBlock(151, 13, Level.HILL_TOP);
			setBlock(151, 14, Level.GROUND);
			setBlock(152, 13, Level.HILL_TOP);
			setBlock(152, 14, Level.GROUND);
			setBlock(153, 13, Level.HILL_TOP);
			setBlock(153, 14, Level.GROUND);
			setBlock(154, 13, Level.HILL_TOP);
			setBlock(154, 14, Level.GROUND);
			setBlock(155, 13, Level.HILL_TOP);
			setBlock(155, 14, Level.GROUND);
			setBlock(156, 13, Level.HILL_TOP);
			setBlock(156, 14, Level.GROUND);
			setBlock(157, 13, Level.HILL_TOP);
			setBlock(157, 14, Level.GROUND);
			setBlock(158, 13, Level.HILL_TOP);
			setBlock(158, 14, Level.GROUND);
			setBlock(159, 13, Level.HILL_TOP);
			setBlock(159, 14, Level.GROUND);
			setBlock(160, 13, Level.HILL_TOP);
			setBlock(160, 14, Level.GROUND);
			setBlock(161, 13, Level.HILL_TOP);
			setBlock(161, 14, Level.GROUND);
			setBlock(162, 13, Level.HILL_TOP);
			setBlock(162, 14, Level.GROUND);
			setBlock(163, 13, Level.HILL_TOP);
			setBlock(163, 14, Level.GROUND);
			setBlock(164, 13, Level.HILL_TOP);
			setBlock(164, 14, Level.GROUND);
			setBlock(165, 13, Level.HILL_TOP);
			setBlock(165, 14, Level.GROUND);
			setBlock(166, 13, Level.HILL_TOP);
			setBlock(166, 14, Level.GROUND);
			setBlock(167, 13, Level.HILL_TOP);
			setBlock(167, 14, Level.GROUND);
			setBlock(168, 13, Level.HILL_TOP);
			setBlock(168, 14, Level.GROUND);
			setBlock(169, 13, Level.HILL_TOP);
			setBlock(169, 14, Level.GROUND);
			setBlock(170, 13, Level.HILL_TOP);
			setBlock(170, 14, Level.GROUND);
			setBlock(171, 13, Level.HILL_TOP);
			setBlock(171, 14, Level.GROUND);
			setBlock(172, 13, Level.HILL_TOP);
			setBlock(172, 14, Level.GROUND);
			setBlock(173, 13, Level.HILL_TOP);
			setBlock(173, 14, Level.GROUND);
			setBlock(174, 13, Level.HILL_TOP);
			setBlock(174, 14, Level.GROUND);
			setBlock(175, 13, Level.HILL_TOP);
			setBlock(175, 14, Level.GROUND);
			setBlock(176, 13, Level.HILL_TOP);
			setBlock(176, 14, Level.GROUND);
			setBlock(177, 13, Level.HILL_TOP);
			setBlock(177, 14, Level.GROUND);
			setBlock(178, 13, Level.HILL_TOP);
			setBlock(178, 14, Level.GROUND);
			setBlock(179, 13, Level.HILL_TOP);
			setBlock(179, 14, Level.GROUND);
			setBlock(180, 13, Level.HILL_TOP);
			setBlock(180, 14, Level.GROUND);
			setBlock(181, 13, Level.HILL_TOP);
			setBlock(181, 14, Level.GROUND);
			setBlock(182, 13, Level.HILL_TOP);
			setBlock(182, 14, Level.GROUND);
			setBlock(183, 13, Level.HILL_TOP);
			setBlock(183, 14, Level.GROUND);
			setBlock(187, 13, Level.HILL_TOP);
			setBlock(187, 14, Level.GROUND);
			setBlock(188, 13, Level.HILL_TOP);
			setBlock(188, 14, Level.GROUND);
			setBlock(189, 13, Level.HILL_TOP);
			setBlock(189, 14, Level.GROUND);
			setBlock(190, 13, Level.HILL_TOP);
			setBlock(190, 14, Level.GROUND);
			setBlock(191, 13, Level.HILL_TOP);
			setBlock(191, 14, Level.GROUND);
			setBlock(192, 13, Level.HILL_TOP);
			setBlock(192, 14, Level.GROUND);
			setBlock(193, 13, Level.HILL_TOP);
			setBlock(193, 14, Level.GROUND);
			setBlock(194, 13, Level.HILL_TOP);
			setBlock(194, 14, Level.GROUND);
			setBlock(195, 13, Level.HILL_TOP);
			setBlock(195, 14, Level.GROUND);
			setBlock(196, 13, Level.HILL_TOP);
			setBlock(196, 14, Level.GROUND);
			setBlock(197, 13, Level.HILL_TOP);
			setBlock(197, 14, Level.GROUND);
			setBlock(198, 13, Level.HILL_TOP);
			setBlock(198, 14, Level.GROUND);
			setBlock(199, 13, Level.HILL_TOP);
			setBlock(199, 14, Level.GROUND);
			xExit = 189;
			yExit =13;

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
