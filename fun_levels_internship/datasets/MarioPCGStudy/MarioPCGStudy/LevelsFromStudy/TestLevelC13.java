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
public class TestLevelC13 extends Level{
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
		
		public TestLevelC13(int width, int height)
	    {
			super(width, height);
	    }


		public TestLevelC13(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
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
			setBlock(21, 12, ROCK);
			setBlock(22, 11, ROCK);
			setBlock(23, 11, ROCK);
			setBlock(22, 12, ROCK);
			setBlock(23, 12, ROCK);
			setBlock(23, 10, ROCK);
			setBlock(24, 10, ROCK);
			setBlock(24, 11, ROCK);
			setBlock(24, 12, ROCK);
			setBlock(24, 9, ROCK);
			setBlock(25, 9, ROCK);
			setBlock(25, 10, ROCK);
			setBlock(25, 11, ROCK);
			setBlock(25, 12, ROCK);
			setBlock(26, 9, ROCK);
			setBlock(26, 11, ROCK);
			setBlock(26, 12, ROCK);
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
			setBlock(29, 13, HILL_TOP);
			setBlock(29, 14, GROUND);
			setBlock(32, 11, ROCK);
			setBlock(33, 11, ROCK);
			setBlock(33, 10, ROCK);
			setBlock(34, 10, ROCK);
			setBlock(34, 11, ROCK);
			setBlock(34, 9, ROCK);
			setBlock(35, 9, ROCK);
			setBlock(35, 10, ROCK);
			setBlock(35, 11, ROCK);
			setBlock(37, 8, ROCK);
			setBlock(37, 10, ROCK);
			setBlock(37, 11, ROCK);
			setBlock(37, 6, ROCK);
			setBlock(37, 7, ROCK);
			setBlock(37, 9, ROCK);
			setBlock(38, 7, ROCK);
			setBlock(38, 8, ROCK);
			setBlock(38, 9, ROCK);
			setBlock(39, 9, ROCK);
			setBlock(38, 10, ROCK);
			setBlock(38, 11, ROCK);
			setBlock(38, 6, ROCK);
			setBlock(38, 5, ROCK);
			setBlock(39, 5, ROCK);
			setBlock(39, 6, ROCK);
			setBlock(39, 7, ROCK);
			setBlock(39, 8, ROCK);
			setBlock(39, 10, ROCK);
			setBlock(39, 11, ROCK);
			setBlock(43, 9, BLOCK_POWERUP);
			setBlock(30, 13, HILL_TOP);
			setBlock(30, 14, GROUND);
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
			setBlock(41, 13, HILL_TOP);
			setBlock(41, 14, GROUND);
			setSpriteTemplate(48, 7, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(47, 10, ROCK);
			setBlock(48, 10, ROCK);
			setBlock(49, 9, ROCK);
			setBlock(49, 10, ROCK);
			setBlock(50, 8, ROCK);
			setBlock(50, 9, ROCK);
			setBlock(50, 10, ROCK);
			setBlock(51, 8, ROCK);
			setBlock(51, 7, ROCK);
			setBlock(51, 9, ROCK);
			setBlock(51, 10, ROCK);
			setBlock(52, 7, ROCK);
			setBlock(52, 10, ROCK);
			setBlock(52, 6, ROCK);
			setBlock(52, 8, ROCK);
			setBlock(52, 9, ROCK);
			setBlock(53, 6, ROCK);
			setBlock(53, 7, ROCK);
			setBlock(53, 8, ROCK);
			setBlock(53, 10, ROCK);
			setBlock(52, 5, ROCK);
			setBlock(53, 5, ROCK);
			setBlock(53, 9, ROCK);
			setBlock(53, 4, ROCK);
			setBlock(44, 13, HILL_TOP);
			setBlock(44, 14, GROUND);
			setBlock(45, 13, HILL_TOP);
			setBlock(45, 14, GROUND);
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
			setSpriteTemplate(60, 5, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(55, 11, ROCK);
			setBlock(56, 10, ROCK);
			setBlock(56, 11, ROCK);
			setBlock(57, 9, ROCK);
			setBlock(57, 10, ROCK);
			setBlock(57, 11, ROCK);
			setBlock(58, 9, ROCK);
			setBlock(58, 10, ROCK);
			setBlock(58, 11, ROCK);
			setBlock(59, 8, ROCK);
			setBlock(60, 8, ROCK);
			setBlock(59, 9, ROCK);
			setBlock(60, 9, ROCK);
			setBlock(60, 10, ROCK);
			setBlock(60, 11, ROCK);
			setBlock(60, 7, ROCK);
			setBlock(60, 6, ROCK);
			setBlock(61, 6, ROCK);
			setBlock(61, 7, ROCK);
			setBlock(61, 8, ROCK);
			setBlock(61, 9, ROCK);
			setBlock(61, 10, ROCK);
			setBlock(61, 11, ROCK);
			setBlock(61, 5, ROCK);
			setBlock(62, 5, ROCK);
			setBlock(62, 6, ROCK);
			setBlock(62, 7, ROCK);
			setBlock(62, 8, ROCK);
			setBlock(62, 9, ROCK);
			setBlock(62, 10, ROCK);
			setBlock(62, 11, ROCK);
			setBlock(59, 13, HILL_TOP);
			setBlock(59, 14, GROUND);
			setBlock(60, 13, HILL_TOP);
			setBlock(60, 14, GROUND);
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
			setBlock(66, 13, HILL_TOP);
			setBlock(66, 14, GROUND);
			setBlock(66, 9, BLOCK_POWERUP);
			setBlock(67, 9, BLOCK_POWERUP);
			setBlock(75, 7, COIN);
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
			setBlock(68, 11, ROCK);
			setBlock(69, 11, ROCK);
			setBlock(70, 9, ROCK);
			setBlock(70, 10, ROCK);
			setBlock(70, 11, ROCK);
			setBlock(71, 11, ROCK);
			setBlock(71, 8, ROCK);
			setBlock(71, 9, ROCK);
			setBlock(71, 10, ROCK);
			setBlock(72, 8, ROCK);
			setBlock(72, 10, ROCK);
			setBlock(72, 11, ROCK);
			setBlock(72, 9, ROCK);
			setBlock(72, 7, ROCK);
			setBlock(91, 11, TUBE_TOP_LEFT);
			setBlock(92, 11, TUBE_TOP_RIGHT);
			setBlock(84, 9, BLOCK_COIN);
			setBlock(85, 9, BLOCK_EMPTY);
			setBlock(86, 9, BLOCK_EMPTY);
			setBlock(85, 5, BLOCK_POWERUP);
			setBlock(91, 12, TUBE_SIDE_LEFT);
			setBlock(92, 12, TUBE_SIDE_RIGHT);
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
			setBlock(91, 13, HILL_TOP);
			setBlock(91, 14, GROUND);
			setBlock(92, 13, HILL_TOP);
			setBlock(92, 14, GROUND);
			setBlock(93, 13, HILL_TOP);
			setBlock(93, 14, GROUND);
			setBlock(94, 13, HILL_TOP);
			setBlock(94, 14, GROUND);
			setBlock(95, 13, HILL_TOP);
			setBlock(95, 14, GROUND);
			setBlock(96, 13, HILL_TOP);
			setBlock(96, 14, GROUND);
			setBlock(97, 13, HILL_TOP);
			setBlock(97, 14, GROUND);
			setSpriteTemplate(102, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
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
			setBlock(110, 13, HILL_TOP);
			setBlock(110, 14, GROUND);
			setBlock(111, 13, HILL_TOP);
			setBlock(111, 14, GROUND);
			setBlock(112, 13, HILL_TOP);
			setBlock(112, 14, GROUND);
			setBlock(121, 11, TUBE_TOP_LEFT);
			setBlock(122, 11, TUBE_TOP_RIGHT);
			setBlock(109, 9, BLOCK_COIN);
			setBlock(115, 9, BLOCK_EMPTY);
			setBlock(116, 9, BLOCK_EMPTY);
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
			setBlock(115, 5, BLOCK_POWERUP);
			setBlock(121, 12, TUBE_SIDE_LEFT);
			setBlock(122, 12, TUBE_SIDE_RIGHT);
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
			setBlock(140, 13, HILL_TOP);
			setBlock(140, 14, GROUND);
			setBlock(141, 13, HILL_TOP);
			setBlock(141, 14, GROUND);
			setBlock(142, 13, HILL_TOP);
			setBlock(142, 14, GROUND);
			setBlock(144, 13, HILL_TOP);
			setBlock(144, 14, GROUND);
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
			setBlock(152, 11, TUBE_TOP_LEFT);
			setBlock(153, 11, TUBE_TOP_RIGHT);
			setBlock(147, 9, BLOCK_COIN);
			setBlock(147, 9, BLOCK_POWERUP);
			setBlock(146, 9, BLOCK_EMPTY);
			setBlock(147, 9, BLOCK_EMPTY);
			setBlock(152, 12, TUBE_SIDE_LEFT);
			setBlock(153, 12, TUBE_SIDE_RIGHT);
			setBlock(143, 13, HILL_TOP);
			setBlock(143, 14, GROUND);
			setBlock(170, 7, (byte) (14 + 0 * 16));
			setBlock(170, 8, (byte) (14 + 1 * 16));
			setBlock(174, 4, COIN);
			setBlock(175, 4, COIN);
			setBlock(176, 4, COIN);
			setBlock(163, 13, HILL_TOP);
			setBlock(163, 14, GROUND);
			setBlock(164, 13, HILL_TOP);
			setBlock(164, 14, GROUND);
			setBlock(165, 13, HILL_TOP);
			setBlock(165, 14, GROUND);
			setBlock(166, 13, HILL_TOP);
			setBlock(166, 14, GROUND);
			setBlock(167, 13, HILL_TOP);
			setBlock(167, 14, GROUND);
			setBlock(168, 13, HILL_TOP);
			setBlock(168, 14, GROUND);
			setBlock(169, 13, HILL_TOP);
			setBlock(169, 14, GROUND);
			setBlock(170, 13, HILL_TOP);
			setBlock(170, 14, GROUND);
			setBlock(171, 13, HILL_TOP);
			setBlock(171, 14, GROUND);
			setBlock(172, 13, HILL_TOP);
			setBlock(172, 14, GROUND);
			setBlock(173, 13, HILL_TOP);
			setBlock(173, 14, GROUND);
			setBlock(174, 13, HILL_TOP);
			setBlock(174, 14, GROUND);
			setBlock(175, 13, HILL_TOP);
			setBlock(175, 14, GROUND);
			setBlock(176, 13, HILL_TOP);
			setBlock(176, 14, GROUND);
			setBlock(165, 11, ROCK);
			setBlock(165, 12, ROCK);
			setBlock(166, 11, ROCK);
			setBlock(166, 12, ROCK);
			setBlock(166, 10, ROCK);
			setBlock(167, 10, ROCK);
			setBlock(167, 11, ROCK);
			setBlock(167, 12, ROCK);
			setBlock(167, 9, ROCK);
			setBlock(168, 9, ROCK);
			setBlock(168, 10, ROCK);
			setBlock(168, 11, ROCK);
			setBlock(168, 12, ROCK);
			setBlock(169, 9, ROCK);
			setBlock(170, 9, ROCK);
			setSpriteTemplate(173, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(158, 13, HILL_TOP);
			setBlock(158, 14, GROUND);
			setBlock(159, 13, HILL_TOP);
			setBlock(159, 14, GROUND);
			setBlock(160, 13, HILL_TOP);
			setBlock(160, 14, GROUND);
			setBlock(161, 13, HILL_TOP);
			setBlock(161, 14, GROUND);
			setBlock(162, 13, HILL_TOP);
			setBlock(162, 14, GROUND);
			setSpriteTemplate(183, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(177, 9, BLOCK_COIN);
			setBlock(180, 13, HILL_TOP);
			setBlock(180, 14, GROUND);
			setBlock(181, 13, HILL_TOP);
			setBlock(181, 14, GROUND);
			setBlock(182, 13, HILL_TOP);
			setBlock(182, 14, GROUND);
			setBlock(183, 13, HILL_TOP);
			setBlock(183, 14, GROUND);
			setBlock(184, 13, HILL_TOP);
			setBlock(184, 14, GROUND);
			setBlock(185, 13, HILL_TOP);
			setBlock(185, 14, GROUND);
			setBlock(186, 13, HILL_TOP);
			setBlock(186, 14, GROUND);
			setBlock(187, 13, HILL_TOP);
			setBlock(187, 14, GROUND);
			setBlock(190, 10, TUBE_SIDE_LEFT);
			setBlock(191, 10, TUBE_SIDE_RIGHT);
			setBlock(190, 11, TUBE_SIDE_LEFT);
			setBlock(191, 11, TUBE_SIDE_RIGHT);
			setBlock(190, 12, TUBE_SIDE_LEFT);
			setBlock(191, 12, TUBE_SIDE_RIGHT);
			setBlock(190, 9, TUBE_TOP_LEFT);
			setBlock(191, 9, TUBE_TOP_RIGHT);
			setBlock(178, 13, HILL_TOP);
			setBlock(178, 14, GROUND);
			setBlock(179, 13, HILL_TOP);
			setBlock(179, 14, GROUND);
			setBlock(188, 13, HILL_TOP);
			setBlock(188, 14, GROUND);
			setBlock(189, 13, HILL_TOP);
			setBlock(189, 14, GROUND);
			setBlock(190, 13, HILL_TOP);
			setBlock(190, 14, GROUND);
			setBlock(191, 13, HILL_TOP);
			setBlock(191, 14, GROUND);
			setBlock(202, 13, HILL_TOP);
			setBlock(202, 14, GROUND);
			setBlock(203, 13, HILL_TOP);
			setBlock(203, 14, GROUND);
			setBlock(204, 13, HILL_TOP);
			setBlock(204, 14, GROUND);
			setBlock(205, 13, HILL_TOP);
			setBlock(205, 14, GROUND);
			setBlock(206, 13, HILL_TOP);
			setBlock(206, 14, GROUND);
			setBlock(207, 13, HILL_TOP);
			setBlock(207, 14, GROUND);
			setBlock(208, 13, HILL_TOP);
			setBlock(208, 14, GROUND);
			setBlock(209, 13, HILL_TOP);
			setBlock(209, 14, GROUND);
			setBlock(210, 13, HILL_TOP);
			setBlock(210, 14, GROUND);
			setBlock(209, 9, TUBE_TOP_LEFT);
			setBlock(210, 9, TUBE_TOP_RIGHT);
			setBlock(209, 10, TUBE_SIDE_LEFT);
			setBlock(210, 10, TUBE_SIDE_RIGHT);
			setBlock(209, 11, TUBE_SIDE_LEFT);
			setBlock(210, 11, TUBE_SIDE_RIGHT);
			setBlock(209, 12, TUBE_SIDE_LEFT);
			setBlock(210, 12, TUBE_SIDE_RIGHT);
			setBlock(200, 13, HILL_TOP);
			setBlock(200, 14, GROUND);
			setBlock(201, 13, HILL_TOP);
			setBlock(201, 14, GROUND);
			setBlock(213, 13, HILL_TOP);
			setBlock(213, 14, GROUND);
			setBlock(214, 13, HILL_TOP);
			setBlock(214, 14, GROUND);
			setBlock(215, 13, HILL_TOP);
			setBlock(215, 14, GROUND);
			setBlock(216, 13, HILL_TOP);
			setBlock(216, 14, GROUND);
			setBlock(217, 13, HILL_TOP);
			setBlock(217, 14, GROUND);
			setBlock(218, 13, HILL_TOP);
			setBlock(218, 14, GROUND);
			setBlock(219, 13, HILL_TOP);
			setBlock(219, 14, GROUND);
			setBlock(220, 13, HILL_TOP);
			setBlock(220, 14, GROUND);
			setBlock(221, 13, HILL_TOP);
			setBlock(221, 14, GROUND);
			setBlock(222, 13, HILL_TOP);
			setBlock(222, 14, GROUND);
			setBlock(223, 13, HILL_TOP);
			setBlock(223, 14, GROUND);
			setBlock(224, 13, HILL_TOP);
			setBlock(224, 14, GROUND);
			setBlock(225, 13, HILL_TOP);
			setBlock(225, 14, GROUND);
			setBlock(226, 13, HILL_TOP);
			setBlock(226, 14, GROUND);
			setBlock(227, 13, HILL_TOP);
			setBlock(227, 14, GROUND);
			setBlock(221, 10, TUBE_SIDE_LEFT);
			setBlock(222, 10, TUBE_SIDE_RIGHT);
			setBlock(221, 11, TUBE_SIDE_LEFT);
			setBlock(222, 11, TUBE_SIDE_RIGHT);
			setBlock(221, 12, TUBE_SIDE_LEFT);
			setBlock(222, 12, TUBE_SIDE_RIGHT);
			setBlock(221, 9, TUBE_TOP_LEFT);
			setBlock(222, 9, TUBE_TOP_RIGHT);
			setBlock(231, 9, BLOCK_COIN);
			setBlock(228, 13, HILL_TOP);
			setBlock(228, 14, GROUND);
			setBlock(229, 13, HILL_TOP);
			setBlock(229, 14, GROUND);
			setBlock(230, 13, HILL_TOP);
			setBlock(230, 14, GROUND);
			setBlock(231, 13, HILL_TOP);
			setBlock(231, 14, GROUND);
			setBlock(232, 13, HILL_TOP);
			setBlock(232, 14, GROUND);
			setBlock(233, 13, HILL_TOP);
			setBlock(233, 14, GROUND);
			setBlock(234, 13, HILL_TOP);
			setBlock(234, 14, GROUND);
			setBlock(235, 13, HILL_TOP);
			setBlock(235, 14, GROUND);
			setBlock(236, 13, HILL_TOP);
			setBlock(236, 14, GROUND);
			setBlock(237, 13, HILL_TOP);
			setBlock(237, 14, GROUND);
			setBlock(238, 13, HILL_TOP);
			setBlock(238, 14, GROUND);
			setBlock(239, 13, HILL_TOP);
			setBlock(239, 14, GROUND);
			setBlock(240, 13, HILL_TOP);
			setBlock(240, 14, GROUND);
			setBlock(235, 9, TUBE_TOP_LEFT);
			setBlock(236, 9, TUBE_TOP_RIGHT);
			setBlock(235, 10, TUBE_SIDE_LEFT);
			setBlock(236, 10, TUBE_SIDE_RIGHT);
			setBlock(235, 11, TUBE_SIDE_LEFT);
			setBlock(236, 11, TUBE_SIDE_RIGHT);
			setBlock(235, 12, TUBE_SIDE_LEFT);
			setBlock(236, 12, TUBE_SIDE_RIGHT);
			setBlock(233, 9, BLOCK_EMPTY);
			setBlock(234, 9, BLOCK_EMPTY);
			setBlock(237, 9, BLOCK_EMPTY);
			setBlock(238, 9, BLOCK_EMPTY);
			setBlock(239, 9, BLOCK_EMPTY);
			setBlock(240, 9, BLOCK_EMPTY);
			setBlock(241, 9, BLOCK_EMPTY);
			setBlock(242, 9, BLOCK_EMPTY);
			setBlock(247, 11, TUBE_TOP_LEFT);
			setBlock(248, 11, TUBE_TOP_RIGHT);
			setBlock(247, 12, TUBE_SIDE_LEFT);
			setBlock(248, 12, TUBE_SIDE_RIGHT);
			setBlock(241, 13, HILL_TOP);
			setBlock(241, 14, GROUND);
			setBlock(242, 13, HILL_TOP);
			setBlock(242, 14, GROUND);
			setBlock(243, 13, HILL_TOP);
			setBlock(243, 14, GROUND);
			setBlock(244, 13, HILL_TOP);
			setBlock(244, 14, GROUND);
			setBlock(245, 13, HILL_TOP);
			setBlock(245, 14, GROUND);
			setBlock(246, 13, HILL_TOP);
			setBlock(246, 14, GROUND);
			setBlock(247, 13, HILL_TOP);
			setBlock(247, 14, GROUND);
			setBlock(248, 13, HILL_TOP);
			setBlock(248, 14, GROUND);
			setBlock(249, 13, HILL_TOP);
			setBlock(249, 14, GROUND);
			setBlock(250, 13, HILL_TOP);
			setBlock(250, 14, GROUND);
			setBlock(251, 13, HILL_TOP);
			setBlock(251, 14, GROUND);
			setBlock(252, 13, HILL_TOP);
			setBlock(252, 14, GROUND);
			setBlock(253, 13, HILL_TOP);
			setBlock(253, 14, GROUND);
			setBlock(240, 9, BLOCK_COIN);
			setBlock(242, 9, BLOCK_COIN);
			setBlock(260, 9, BLOCK_EMPTY);
			setBlock(260, 8, BLOCK_EMPTY);
			setBlock(261, 8, BLOCK_EMPTY);
			setBlock(261, 9, BLOCK_EMPTY);
			setBlock(266, 11, TUBE_TOP_LEFT);
			setBlock(267, 11, TUBE_TOP_RIGHT);
			setBlock(266, 12, TUBE_SIDE_LEFT);
			setBlock(267, 12, TUBE_SIDE_RIGHT);
			setBlock(259, 9, BLOCK_COIN);
			setBlock(257, 13, HILL_TOP);
			setBlock(257, 14, GROUND);
			setBlock(258, 13, HILL_TOP);
			setBlock(258, 14, GROUND);
			setBlock(259, 13, HILL_TOP);
			setBlock(259, 14, GROUND);
			setBlock(260, 13, HILL_TOP);
			setBlock(260, 14, GROUND);
			setBlock(261, 13, HILL_TOP);
			setBlock(261, 14, GROUND);
			setBlock(262, 13, HILL_TOP);
			setBlock(262, 14, GROUND);
			setBlock(263, 13, HILL_TOP);
			setBlock(263, 14, GROUND);
			setBlock(264, 13, HILL_TOP);
			setBlock(264, 14, GROUND);
			setBlock(265, 13, HILL_TOP);
			setBlock(265, 14, GROUND);
			setBlock(266, 13, HILL_TOP);
			setBlock(266, 14, GROUND);
			setBlock(267, 13, HILL_TOP);
			setBlock(267, 14, GROUND);
			setBlock(268, 13, HILL_TOP);
			setBlock(268, 14, GROUND);
			setBlock(269, 13, HILL_TOP);
			setBlock(269, 14, GROUND);
			setBlock(270, 13, HILL_TOP);
			setBlock(270, 14, GROUND);
			setBlock(271, 13, HILL_TOP);
			setBlock(271, 14, GROUND);
			setBlock(254, 9, BLOCK_COIN);
			setBlock(274, 13, HILL_TOP);
			setBlock(274, 14, GROUND);
			setBlock(275, 13, HILL_TOP);
			setBlock(275, 14, GROUND);
			setBlock(278, 13, HILL_TOP);
			setBlock(278, 14, GROUND);
			setBlock(279, 13, HILL_TOP);
			setBlock(279, 14, GROUND);
			setBlock(280, 13, HILL_TOP);
			setBlock(280, 14, GROUND);
			setBlock(281, 13, HILL_TOP);
			setBlock(281, 14, GROUND);
			setBlock(282, 13, HILL_TOP);
			setBlock(282, 14, GROUND);
			setBlock(283, 13, HILL_TOP);
			setBlock(283, 14, GROUND);
			setBlock(284, 13, HILL_TOP);
			setBlock(284, 14, GROUND);
			setBlock(285, 13, HILL_TOP);
			setBlock(285, 14, GROUND);
			setBlock(286, 13, HILL_TOP);
			setBlock(286, 14, GROUND);
			setBlock(287, 13, HILL_TOP);
			setBlock(287, 14, GROUND);
			setBlock(288, 13, HILL_TOP);
			setBlock(288, 14, GROUND);
			setBlock(289, 13, HILL_TOP);
			setBlock(289, 14, GROUND);
			setBlock(290, 13, HILL_TOP);
			setBlock(290, 14, GROUND);
			setBlock(272, 13, HILL_TOP);
			setBlock(272, 14, GROUND);
			setBlock(273, 13, HILL_TOP);
			setBlock(273, 14, GROUND);
			setBlock(276, 13, HILL_TOP);
			setBlock(276, 14, GROUND);
			setBlock(277, 13, HILL_TOP);
			setBlock(277, 14, GROUND);
			setBlock(294, 8, BLOCK_COIN);
			setBlock(295, 8, BLOCK_COIN);
			setBlock(296, 8, BLOCK_COIN);
			setBlock(297, 8, BLOCK_COIN);
			setBlock(300, 13, HILL_TOP);
			setBlock(300, 14, GROUND);
			setBlock(301, 13, HILL_TOP);
			setBlock(301, 14, GROUND);
			setBlock(302, 13, HILL_TOP);
			setBlock(302, 14, GROUND);
			setBlock(303, 13, HILL_TOP);
			setBlock(303, 14, GROUND);
			setBlock(304, 13, HILL_TOP);
			setBlock(304, 14, GROUND);
			setBlock(305, 13, HILL_TOP);
			setBlock(305, 14, GROUND);
			setBlock(306, 13, HILL_TOP);
			setBlock(306, 14, GROUND);
			setBlock(307, 13, HILL_TOP);
			setBlock(307, 14, GROUND);
			setBlock(308, 13, HILL_TOP);
			setBlock(308, 14, GROUND);
			setBlock(309, 13, HILL_TOP);
			setBlock(309, 14, GROUND);
			setBlock(310, 13, HILL_TOP);
			setBlock(310, 14, GROUND);
			setBlock(311, 13, HILL_TOP);
			setBlock(311, 14, GROUND);
			setBlock(293, 13, HILL_TOP);
			setBlock(293, 14, GROUND);
			setBlock(294, 13, HILL_TOP);
			setBlock(294, 14, GROUND);
			setBlock(295, 13, HILL_TOP);
			setBlock(295, 14, GROUND);
			setBlock(296, 13, HILL_TOP);
			setBlock(296, 14, GROUND);
			setBlock(297, 13, HILL_TOP);
			setBlock(297, 14, GROUND);
			setBlock(298, 13, HILL_TOP);
			setBlock(298, 14, GROUND);
			setBlock(299, 13, HILL_TOP);
			setBlock(299, 14, GROUND);
			setBlock(326, 11, (byte) (14 + 0 * 16));
			setBlock(326, 12, (byte) (14 + 1 * 16));
			setBlock(312, 13, HILL_TOP);
			setBlock(312, 14, GROUND);
			setBlock(313, 13, HILL_TOP);
			setBlock(313, 14, GROUND);
			setBlock(314, 13, HILL_TOP);
			setBlock(314, 14, GROUND);
			setBlock(315, 13, HILL_TOP);
			setBlock(315, 14, GROUND);
			setBlock(316, 13, HILL_TOP);
			setBlock(316, 14, GROUND);
			setBlock(317, 13, HILL_TOP);
			setBlock(317, 14, GROUND);
			setBlock(318, 13, HILL_TOP);
			setBlock(318, 14, GROUND);
			setBlock(319, 13, HILL_TOP);
			setBlock(319, 14, GROUND);
			setBlock(320, 13, HILL_TOP);
			setBlock(320, 14, GROUND);
			setBlock(321, 13, HILL_TOP);
			setBlock(321, 14, GROUND);
			setBlock(322, 13, HILL_TOP);
			setBlock(322, 14, GROUND);
			setBlock(323, 13, HILL_TOP);
			setBlock(323, 14, GROUND);
			setBlock(324, 13, HILL_TOP);
			setBlock(324, 14, GROUND);
			setBlock(325, 13, HILL_TOP);
			setBlock(325, 14, GROUND);
			setSpriteTemplate(316, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(314, 11, TUBE_SIDE_LEFT);
			setBlock(315, 11, TUBE_SIDE_RIGHT);
			setBlock(314, 12, TUBE_SIDE_LEFT);
			setBlock(315, 12, TUBE_SIDE_RIGHT);
			setBlock(314, 10, TUBE_TOP_LEFT);
			setBlock(315, 10, TUBE_TOP_RIGHT);
			setBlock(320, 11, TUBE_TOP_LEFT);
			setBlock(321, 11, TUBE_TOP_RIGHT);
			setBlock(320, 12, TUBE_SIDE_LEFT);
			setBlock(321, 12, TUBE_SIDE_RIGHT);
			setBlock(332, 8, BLOCK_COIN);
			setBlock(326, 13, HILL_TOP);
			setBlock(326, 14, GROUND);
			setBlock(327, 13, HILL_TOP);
			setBlock(327, 14, GROUND);
			setBlock(328, 13, HILL_TOP);
			setBlock(328, 14, GROUND);
			setBlock(329, 13, HILL_TOP);
			setBlock(329, 14, GROUND);
			setBlock(330, 13, HILL_TOP);
			setBlock(330, 14, GROUND);
			setBlock(331, 13, HILL_TOP);
			setBlock(331, 14, GROUND);
			setBlock(332, 13, HILL_TOP);
			setBlock(332, 14, GROUND);
			setBlock(333, 13, HILL_TOP);
			setBlock(333, 14, GROUND);
			setBlock(344, 13, TUBE_SIDE_LEFT);
			setBlock(345, 13, TUBE_SIDE_RIGHT);
			setBlock(345, 12, TUBE_SIDE_LEFT);
			setBlock(346, 12, TUBE_SIDE_RIGHT);
			setBlock(345, 11, TUBE_SIDE_LEFT);
			setBlock(346, 10, TUBE_SIDE_RIGHT);
			setBlock(345, 10, TUBE_SIDE_LEFT);
			setBlock(346, 11, TUBE_SIDE_RIGHT);
			setBlock(345, 9, TUBE_TOP_LEFT);
			setBlock(346, 9, TUBE_TOP_RIGHT);
			setBlock(338, 13, HILL_TOP);
			setBlock(338, 14, GROUND);
			setBlock(339, 13, HILL_TOP);
			setBlock(339, 14, GROUND);
			setBlock(340, 13, HILL_TOP);
			setBlock(340, 14, GROUND);
			setBlock(341, 13, HILL_TOP);
			setBlock(341, 14, GROUND);
			setBlock(342, 13, HILL_TOP);
			setBlock(342, 14, GROUND);
			setBlock(343, 13, HILL_TOP);
			setBlock(343, 14, GROUND);
			setBlock(344, 13, HILL_TOP);
			setBlock(344, 14, GROUND);
			setBlock(345, 13, HILL_TOP);
			setBlock(345, 14, GROUND);
			setBlock(346, 13, HILL_TOP);
			setBlock(346, 14, GROUND);
			setBlock(347, 13, HILL_TOP);
			setBlock(347, 14, GROUND);
			setBlock(348, 13, HILL_TOP);
			setBlock(348, 14, GROUND);
			setBlock(349, 13, HILL_TOP);
			setBlock(349, 14, GROUND);
			setBlock(350, 13, HILL_TOP);
			setBlock(350, 14, GROUND);
			setBlock(351, 13, HILL_TOP);
			setBlock(351, 14, GROUND);
			setBlock(352, 13, HILL_TOP);
			setBlock(352, 14, GROUND);
			setSpriteTemplate(364, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setSpriteTemplate(106, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(360, 11, ROCK);
			setBlock(360, 12, ROCK);
			setBlock(360, 10, ROCK);
			setBlock(353, 13, HILL_TOP);
			setBlock(353, 14, GROUND);
			setBlock(354, 13, HILL_TOP);
			setBlock(354, 14, GROUND);
			setBlock(355, 13, HILL_TOP);
			setBlock(355, 14, GROUND);
			setBlock(356, 13, HILL_TOP);
			setBlock(356, 14, GROUND);
			setBlock(357, 13, HILL_TOP);
			setBlock(357, 14, GROUND);
			setBlock(358, 13, HILL_TOP);
			setBlock(358, 14, GROUND);
			setBlock(359, 13, HILL_TOP);
			setBlock(359, 14, GROUND);
			setBlock(360, 13, HILL_TOP);
			setBlock(360, 14, GROUND);
			setBlock(361, 13, HILL_TOP);
			setBlock(361, 14, GROUND);
			setBlock(362, 13, HILL_TOP);
			setBlock(362, 14, GROUND);
			setBlock(363, 13, HILL_TOP);
			setBlock(363, 14, GROUND);
			setBlock(364, 13, HILL_TOP);
			setBlock(364, 14, GROUND);
			setBlock(365, 13, HILL_TOP);
			setBlock(365, 14, GROUND);
			setBlock(366, 13, HILL_TOP);
			setBlock(366, 14, GROUND);
			setBlock(367, 13, HILL_TOP);
			setBlock(367, 14, GROUND);
			setBlock(371, 12, ROCK);
			setBlock(368, 13, HILL_TOP);
			setBlock(368, 14, GROUND);
			setBlock(369, 13, HILL_TOP);
			setBlock(369, 14, GROUND);
			setBlock(370, 13, HILL_TOP);
			setBlock(370, 14, GROUND);
			setBlock(371, 13, HILL_TOP);
			setBlock(371, 14, GROUND);
			setBlock(372, 13, HILL_TOP);
			setBlock(372, 14, GROUND);
			setBlock(373, 13, HILL_TOP);
			setBlock(373, 14, GROUND);
			setBlock(374, 13, HILL_TOP);
			setBlock(374, 14, GROUND);
			setBlock(375, 13, HILL_TOP);
			setBlock(375, 14, GROUND);
			setBlock(376, 13, HILL_TOP);
			setBlock(376, 14, GROUND);
			setBlock(377, 13, HILL_TOP);
			setBlock(377, 14, GROUND);
			setBlock(378, 13, HILL_TOP);
			setBlock(378, 14, GROUND);
			setBlock(379, 13, HILL_TOP);
			setBlock(379, 14, GROUND);
			setBlock(380, 13, HILL_TOP);
			setBlock(380, 14, GROUND);
			setBlock(381, 13, HILL_TOP);
			setBlock(381, 14, GROUND);
			setBlock(26, 10, ROCK);
			setBlock(36, 9, ROCK);
			setBlock(36, 10, ROCK);
			setBlock(36, 11, ROCK);
			setBlock(59, 10, ROCK);
			setBlock(59, 11, ROCK);
			setBlock(177, 13, HILL_TOP);
			setBlock(177, 14, GROUND);
			setBlock(241, 9, BLOCK_COIN);
			xExit = 369;
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
