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
public class MarioLevel extends Level{
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
		
		public MarioLevel(int width, int height)
	    {
			super(width, height);
	    }


		public MarioLevel(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
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

	        //Level 1-1 
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
			setBlock(16, 9, BLOCK_COIN);
			setBlock(16, 13, HILL_TOP);
			setBlock(16, 14, GROUND);
			setBlock(17, 13, HILL_TOP);
			setBlock(17, 14, GROUND);
			setBlock(18, 13, HILL_TOP);
			setBlock(18, 14, GROUND);
			setBlock(19, 13, HILL_TOP);
			setBlock(19, 14, GROUND);
			setBlock(20, 9, BLOCK_EMPTY);
			setBlock(20, 13, HILL_TOP);
			setBlock(20, 14, GROUND);
			setSpriteTemplate(21, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(21, 9, BLOCK_POWERUP);
			setBlock(21, 13, HILL_TOP);
			setBlock(21, 14, GROUND);
			setBlock(22, 5, BLOCK_COIN);
			setBlock(22, 9, BLOCK_EMPTY);
			setBlock(22, 13, HILL_TOP);
			setBlock(22, 14, GROUND);
			setBlock(23, 9, BLOCK_COIN);
			setBlock(23, 13, HILL_TOP);
			setBlock(23, 14, GROUND);
			setBlock(24, 9, BLOCK_EMPTY);
			setBlock(24, 13, HILL_TOP);
			setBlock(24, 14, GROUND);
			setBlock(25, 13, HILL_TOP);
			setBlock(25, 14, GROUND);
			setBlock(26, 13, HILL_TOP);
			setBlock(26, 14, GROUND);
			setBlock(27, 13, HILL_TOP);
			setBlock(27, 14, GROUND);
			setBlock(28, 11, TUBE_TOP_LEFT);
			setBlock(29, 11, TUBE_TOP_RIGHT);
			setBlock(28, 12, TUBE_SIDE_LEFT);
			setBlock(29, 12, TUBE_SIDE_RIGHT);
			setBlock(28, 12, TUBE_SIDE_LEFT);
			setBlock(29, 12, TUBE_SIDE_RIGHT);
			setBlock(28, 13, HILL_TOP);
			setBlock(28, 14, GROUND);
			setBlock(29, 13, HILL_TOP);
			setBlock(29, 14, GROUND);
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
			setBlock(37, 10, TUBE_TOP_LEFT);
			setBlock(38, 10, TUBE_TOP_RIGHT);
			setBlock(37, 11, TUBE_SIDE_LEFT);
			setBlock(38, 11, TUBE_SIDE_RIGHT);
			setBlock(37, 11, TUBE_SIDE_LEFT);
			setBlock(38, 11, TUBE_SIDE_RIGHT);
			setBlock(37, 12, TUBE_SIDE_LEFT);
			setBlock(38, 12, TUBE_SIDE_RIGHT);
			setBlock(37, 12, TUBE_SIDE_LEFT);
			setBlock(38, 12, TUBE_SIDE_RIGHT);
			setBlock(37, 13, HILL_TOP);
			setBlock(37, 14, GROUND);
			setBlock(38, 13, HILL_TOP);
			setBlock(38, 14, GROUND);
			setBlock(39, 13, HILL_TOP);
			setBlock(39, 14, GROUND);
			setSpriteTemplate(40, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(40, 13, HILL_TOP);
			setBlock(40, 14, GROUND);
			setBlock(41, 13, HILL_TOP);
			setBlock(41, 14, GROUND);
			setBlock(42, 13, HILL_TOP);
			setBlock(42, 14, GROUND);
			setBlock(43, 13, HILL_TOP);
			setBlock(43, 14, GROUND);
			setBlock(44, 13, HILL_TOP);
			setBlock(44, 14, GROUND);
			setBlock(45, 9, TUBE_TOP_LEFT);
			setBlock(46, 9, TUBE_TOP_RIGHT);
			setBlock(45, 10, TUBE_SIDE_LEFT);
			setBlock(46, 10, TUBE_SIDE_RIGHT);
			setBlock(45, 10, TUBE_SIDE_LEFT);
			setBlock(46, 10, TUBE_SIDE_RIGHT);
			setBlock(45, 11, TUBE_SIDE_LEFT);
			setBlock(46, 11, TUBE_SIDE_RIGHT);
			setBlock(45, 11, TUBE_SIDE_LEFT);
			setBlock(46, 11, TUBE_SIDE_RIGHT);
			setBlock(45, 12, TUBE_SIDE_LEFT);
			setBlock(46, 12, TUBE_SIDE_RIGHT);
			setBlock(45, 12, TUBE_SIDE_LEFT);
			setBlock(46, 12, TUBE_SIDE_RIGHT);
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
			setSpriteTemplate(52, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(52, 13, HILL_TOP);
			setBlock(52, 14, GROUND);
			setSpriteTemplate(53, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(53, 13, HILL_TOP);
			setBlock(53, 14, GROUND);
			setBlock(54, 13, HILL_TOP);
			setBlock(54, 14, GROUND);
			setBlock(55, 13, HILL_TOP);
			setBlock(55, 14, GROUND);
			setBlock(56, 9, TUBE_TOP_LEFT);
			setBlock(57, 9, TUBE_TOP_RIGHT);
			setBlock(56, 10, TUBE_SIDE_LEFT);
			setBlock(57, 10, TUBE_SIDE_RIGHT);
			setBlock(56, 10, TUBE_SIDE_LEFT);
			setBlock(57, 10, TUBE_SIDE_RIGHT);
			setBlock(56, 11, TUBE_SIDE_LEFT);
			setBlock(57, 11, TUBE_SIDE_RIGHT);
			setBlock(56, 11, TUBE_SIDE_LEFT);
			setBlock(57, 11, TUBE_SIDE_RIGHT);
			setBlock(56, 12, TUBE_SIDE_LEFT);
			setBlock(57, 12, TUBE_SIDE_RIGHT);
			setBlock(56, 12, TUBE_SIDE_LEFT);
			setBlock(57, 12, TUBE_SIDE_RIGHT);
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
			setBlock(67, 13, HILL_TOP);
			setBlock(67, 14, GROUND);
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
			setBlock(76, 9, BLOCK_EMPTY);
			setBlock(76, 13, HILL_TOP);
			setBlock(76, 14, GROUND);
			setBlock(77, 9, BLOCK_POWERUP);
			setBlock(77, 13, HILL_TOP);
			setBlock(77, 14, GROUND);
			setSpriteTemplate(78, 6, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(78, 9, BLOCK_EMPTY);
			setBlock(78, 13, HILL_TOP);
			setBlock(78, 14, GROUND);
			setBlock(79, 5, BLOCK_EMPTY);
			setBlock(79, 13, HILL_TOP);
			setBlock(79, 14, GROUND);
			setBlock(80, 5, BLOCK_EMPTY);
			setBlock(80, 13, HILL_TOP);
			setBlock(80, 14, GROUND);
			setBlock(81, 5, BLOCK_EMPTY);
			setBlock(81, 13, HILL_TOP);
			setBlock(81, 14, GROUND);
			setBlock(82, 5, BLOCK_EMPTY);
			setBlock(82, 13, HILL_TOP);
			setBlock(82, 14, GROUND);
			setBlock(83, 5, BLOCK_EMPTY);
			setBlock(83, 13, HILL_TOP);
			setBlock(83, 14, GROUND);
			setBlock(84, 5, BLOCK_EMPTY);
			setBlock(84, 13, HILL_TOP);
			setBlock(84, 14, GROUND);
			setBlock(85, 5, BLOCK_EMPTY);
			setBlock(86, 5, BLOCK_EMPTY);
			setBlock(88, 13, HILL_TOP);
			setBlock(88, 14, GROUND);
			setBlock(89, 13, HILL_TOP);
			setBlock(89, 14, GROUND);
			setBlock(90, 5, BLOCK_EMPTY);
			setBlock(90, 13, HILL_TOP);
			setBlock(90, 14, GROUND);
			setBlock(91, 5, BLOCK_EMPTY);
			setBlock(91, 13, HILL_TOP);
			setBlock(91, 14, GROUND);
			setBlock(92, 5, BLOCK_EMPTY);
			setBlock(92, 13, HILL_TOP);
			setBlock(92, 14, GROUND);
			setBlock(93, 5, BLOCK_POWERUP);
			setBlock(93, 9, BLOCK_EMPTY);
			setBlock(93, 13, HILL_TOP);
			setBlock(93, 14, GROUND);
			setSpriteTemplate(94, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(94, 13, HILL_TOP);
			setBlock(94, 14, GROUND);
			setSpriteTemplate(95, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(95, 13, HILL_TOP);
			setBlock(95, 14, GROUND);
			setBlock(96, 13, HILL_TOP);
			setBlock(96, 14, GROUND);
			setBlock(97, 13, HILL_TOP);
			setBlock(97, 14, GROUND);
			setBlock(98, 13, HILL_TOP);
			setBlock(98, 14, GROUND);
			setBlock(99, 9, BLOCK_EMPTY);
			setBlock(99, 13, HILL_TOP);
			setBlock(99, 14, GROUND);
			setBlock(100, 9, BLOCK_COIN);
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
			setBlock(105, 9, BLOCK_COIN);
			setSpriteTemplate(105, 12, new SpriteTemplate(Enemy.ENEMY_GREEN_KOOPA, false));
			setBlock(105, 13, HILL_TOP);
			setBlock(105, 14, GROUND);
			setBlock(106, 13, HILL_TOP);
			setBlock(106, 14, GROUND);
			setBlock(107, 13, HILL_TOP);
			setBlock(107, 14, GROUND);
			setBlock(108, 5, BLOCK_POWERUP);
			setBlock(108, 9, BLOCK_COIN);
			setBlock(108, 13, HILL_TOP);
			setBlock(108, 14, GROUND);
			setBlock(109, 13, HILL_TOP);
			setBlock(109, 14, GROUND);
			setBlock(110, 13, HILL_TOP);
			setBlock(110, 14, GROUND);
			setBlock(111, 9, BLOCK_COIN);
			setBlock(111, 13, HILL_TOP);
			setBlock(111, 14, GROUND);
			setBlock(112, 13, HILL_TOP);
			setBlock(112, 14, GROUND);
			setBlock(113, 13, HILL_TOP);
			setBlock(113, 14, GROUND);
			setBlock(114, 13, HILL_TOP);
			setBlock(114, 14, GROUND);
			setBlock(115, 13, HILL_TOP);
			setBlock(115, 14, GROUND);
			setBlock(116, 13, HILL_TOP);
			setBlock(116, 14, GROUND);
			setBlock(117, 9, BLOCK_EMPTY);
			setBlock(117, 13, HILL_TOP);
			setBlock(117, 14, GROUND);
			setBlock(118, 13, HILL_TOP);
			setBlock(118, 14, GROUND);
			setBlock(119, 13, HILL_TOP);
			setBlock(119, 14, GROUND);
			setBlock(120, 5, BLOCK_EMPTY);
			setBlock(120, 13, HILL_TOP);
			setBlock(120, 14, GROUND);
			setBlock(121, 5, BLOCK_EMPTY);
			setBlock(121, 13, HILL_TOP);
			setBlock(121, 14, GROUND);
			setBlock(122, 5, BLOCK_EMPTY);
			setBlock(122, 13, HILL_TOP);
			setBlock(122, 14, GROUND);
			setSpriteTemplate(123, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(123, 13, HILL_TOP);
			setBlock(123, 14, GROUND);
			setSpriteTemplate(124, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(124, 13, HILL_TOP);
			setBlock(124, 14, GROUND);
			setBlock(125, 13, HILL_TOP);
			setBlock(125, 14, GROUND);
			setSpriteTemplate(126, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(126, 13, HILL_TOP);
			setBlock(126, 14, GROUND);
			setBlock(127, 5, BLOCK_EMPTY);
			setSpriteTemplate(127, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(127, 13, HILL_TOP);
			setBlock(127, 14, GROUND);
			setBlock(128, 5, BLOCK_COIN);
			setBlock(128, 9, BLOCK_EMPTY);
			setBlock(128, 13, HILL_TOP);
			setBlock(128, 14, GROUND);
			setBlock(129, 5, BLOCK_COIN);
			setBlock(129, 13, HILL_TOP);
			setBlock(129, 14, GROUND);
			setBlock(130, 5, BLOCK_EMPTY);
			setBlock(130, 13, HILL_TOP);
			setBlock(130, 14, GROUND);
			setBlock(131, 13, HILL_TOP);
			setBlock(131, 14, GROUND);
			setBlock(132, 13, HILL_TOP);
			setBlock(132, 14, GROUND);
			setBlock(133, 12, ROCK);
			setBlock(133, 13, HILL_TOP);
			setBlock(133, 14, GROUND);
			setBlock(134, 11, ROCK);
			setBlock(134, 12, ROCK);
			setBlock(134, 13, HILL_TOP);
			setBlock(134, 14, GROUND);
			setBlock(135, 10, ROCK);
			setBlock(135, 11, ROCK);
			setBlock(135, 12, ROCK);
			setBlock(135, 13, HILL_TOP);
			setBlock(135, 14, GROUND);
			setBlock(136, 9, ROCK);
			setBlock(136, 10, ROCK);
			setBlock(136, 11, ROCK);
			setBlock(136, 12, ROCK);
			setBlock(136, 13, HILL_TOP);
			setBlock(136, 14, GROUND);
			setBlock(137, 13, HILL_TOP);
			setBlock(137, 14, GROUND);
			setBlock(138, 13, HILL_TOP);
			setBlock(138, 14, GROUND);
			setBlock(139, 9, ROCK);
			setBlock(139, 10, ROCK);
			setBlock(139, 11, ROCK);
			setBlock(139, 12, ROCK);
			setBlock(139, 13, HILL_TOP);
			setBlock(139, 14, GROUND);
			setBlock(140, 10, ROCK);
			setBlock(140, 11, ROCK);
			setBlock(140, 12, ROCK);
			setBlock(140, 13, HILL_TOP);
			setBlock(140, 14, GROUND);
			setBlock(141, 11, ROCK);
			setBlock(141, 12, ROCK);
			setBlock(141, 13, HILL_TOP);
			setBlock(141, 14, GROUND);
			setBlock(142, 12, ROCK);
			setBlock(142, 13, HILL_TOP);
			setBlock(142, 14, GROUND);
			setBlock(143, 13, HILL_TOP);
			setBlock(143, 14, GROUND);
			setBlock(144, 13, HILL_TOP);
			setBlock(144, 14, GROUND);
			setBlock(145, 13, HILL_TOP);
			setBlock(145, 14, GROUND);
			setBlock(146, 13, HILL_TOP);
			setBlock(146, 14, GROUND);
			setBlock(147, 12, ROCK);
			setBlock(147, 13, HILL_TOP);
			setBlock(147, 14, GROUND);
			setBlock(148, 11, ROCK);
			setBlock(148, 12, ROCK);
			setBlock(148, 13, HILL_TOP);
			setBlock(148, 14, GROUND);
			setBlock(149, 10, ROCK);
			setBlock(149, 11, ROCK);
			setBlock(149, 12, ROCK);
			setBlock(149, 13, HILL_TOP);
			setBlock(149, 14, GROUND);
			setBlock(150, 9, ROCK);
			setBlock(150, 10, ROCK);
			setBlock(150, 11, ROCK);
			setBlock(150, 12, ROCK);
			setBlock(150, 13, HILL_TOP);
			setBlock(150, 14, GROUND);
			setBlock(151, 9, ROCK);
			setBlock(151, 10, ROCK);
			setBlock(151, 11, ROCK);
			setBlock(151, 12, ROCK);
			setBlock(151, 13, HILL_TOP);
			setBlock(151, 14, GROUND);
			setBlock(154, 9, ROCK);
			setBlock(154, 10, ROCK);
			setBlock(154, 11, ROCK);
			setBlock(154, 12, ROCK);
			setBlock(154, 13, HILL_TOP);
			setBlock(154, 14, GROUND);
			setBlock(155, 10, ROCK);
			setBlock(155, 11, ROCK);
			setBlock(155, 12, ROCK);
			setBlock(155, 13, HILL_TOP);
			setBlock(155, 14, GROUND);
			setBlock(156, 11, ROCK);
			setBlock(156, 12, ROCK);
			setBlock(156, 13, HILL_TOP);
			setBlock(156, 14, GROUND);
			setBlock(157, 12, ROCK);
			setBlock(157, 13, HILL_TOP);
			setBlock(157, 14, GROUND);
			setBlock(158, 13, HILL_TOP);
			setBlock(158, 14, GROUND);
			setBlock(159, 13, HILL_TOP);
			setBlock(159, 14, GROUND);
			setBlock(160, 13, HILL_TOP);
			setBlock(160, 14, GROUND);
			setBlock(161, 13, HILL_TOP);
			setBlock(161, 14, GROUND);
			setBlock(162, 11, TUBE_TOP_LEFT);
			setBlock(163, 11, TUBE_TOP_RIGHT);
			setBlock(162, 12, TUBE_SIDE_LEFT);
			setBlock(163, 12, TUBE_SIDE_RIGHT);
			setBlock(162, 12, TUBE_SIDE_LEFT);
			setBlock(163, 12, TUBE_SIDE_RIGHT);
			setBlock(162, 13, HILL_TOP);
			setBlock(162, 14, GROUND);
			setBlock(163, 13, HILL_TOP);
			setBlock(163, 14, GROUND);
			setBlock(164, 13, HILL_TOP);
			setBlock(164, 14, GROUND);
			setBlock(165, 13, HILL_TOP);
			setBlock(165, 14, GROUND);
			setBlock(166, 13, HILL_TOP);
			setBlock(166, 14, GROUND);
			setBlock(167, 9, BLOCK_EMPTY);
			setBlock(167, 13, HILL_TOP);
			setBlock(167, 14, GROUND);
			setBlock(168, 9, BLOCK_EMPTY);
			setBlock(168, 13, HILL_TOP);
			setBlock(168, 14, GROUND);
			setBlock(169, 9, BLOCK_COIN);
			setBlock(169, 13, HILL_TOP);
			setBlock(169, 14, GROUND);
			setBlock(170, 9, BLOCK_EMPTY);
			setBlock(170, 13, HILL_TOP);
			setBlock(170, 14, GROUND);
			setBlock(171, 13, HILL_TOP);
			setBlock(171, 14, GROUND);
			setSpriteTemplate(172, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(172, 13, HILL_TOP);
			setBlock(172, 14, GROUND);
			setBlock(173, 13, HILL_TOP);
			setBlock(173, 14, GROUND);
			setSpriteTemplate(174, 12, new SpriteTemplate(Enemy.ENEMY_GOOMBA, false));
			setBlock(174, 13, HILL_TOP);
			setBlock(174, 14, GROUND);
			setBlock(175, 13, HILL_TOP);
			setBlock(175, 14, GROUND);
			setBlock(176, 13, HILL_TOP);
			setBlock(176, 14, GROUND);
			setBlock(177, 13, HILL_TOP);
			setBlock(177, 14, GROUND);
			setBlock(178, 11, TUBE_TOP_LEFT);
			setBlock(179, 11, TUBE_TOP_RIGHT);
			setBlock(178, 12, TUBE_SIDE_LEFT);
			setBlock(179, 12, TUBE_SIDE_RIGHT);
			setBlock(178, 12, TUBE_SIDE_LEFT);
			setBlock(179, 12, TUBE_SIDE_RIGHT);
			setBlock(178, 13, HILL_TOP);
			setBlock(178, 14, GROUND);
			setBlock(179, 13, HILL_TOP);
			setBlock(179, 14, GROUND);
			setBlock(180, 12, ROCK);
			setBlock(180, 13, HILL_TOP);
			setBlock(180, 14, GROUND);
			setBlock(181, 11, ROCK);
			setBlock(181, 12, ROCK);
			setBlock(181, 13, HILL_TOP);
			setBlock(181, 14, GROUND);
			setBlock(182, 10, ROCK);
			setBlock(182, 11, ROCK);
			setBlock(182, 12, ROCK);
			setBlock(182, 13, HILL_TOP);
			setBlock(182, 14, GROUND);
			setBlock(183, 9, ROCK);
			setBlock(183, 10, ROCK);
			setBlock(183, 11, ROCK);
			setBlock(183, 12, ROCK);
			setBlock(183, 13, HILL_TOP);
			setBlock(183, 14, GROUND);
			setBlock(184, 8, ROCK);
			setBlock(184, 9, ROCK);
			setBlock(184, 10, ROCK);
			setBlock(184, 11, ROCK);
			setBlock(184, 12, ROCK);
			setBlock(184, 13, HILL_TOP);
			setBlock(184, 14, GROUND);
			setBlock(185, 7, ROCK);
			setBlock(185, 8, ROCK);
			setBlock(185, 9, ROCK);
			setBlock(185, 10, ROCK);
			setBlock(185, 11, ROCK);
			setBlock(185, 12, ROCK);
			setBlock(185, 13, HILL_TOP);
			setBlock(185, 14, GROUND);
			setBlock(186, 6, ROCK);
			setBlock(186, 7, ROCK);
			setBlock(186, 8, ROCK);
			setBlock(186, 9, ROCK);
			setBlock(186, 10, ROCK);
			setBlock(186, 11, ROCK);
			setBlock(186, 12, ROCK);
			setBlock(186, 13, HILL_TOP);
			setBlock(186, 14, GROUND);
			setBlock(187, 5, ROCK);
			setBlock(187, 6, ROCK);
			setBlock(187, 7, ROCK);
			setBlock(187, 8, ROCK);
			setBlock(187, 9, ROCK);
			setBlock(187, 10, ROCK);
			setBlock(187, 11, ROCK);
			setBlock(187, 12, ROCK);
			setBlock(187, 13, HILL_TOP);
			setBlock(187, 14, GROUND);
			setBlock(188, 5, ROCK);
			setBlock(188, 6, ROCK);
			setBlock(188, 7, ROCK);
			setBlock(188, 8, ROCK);
			setBlock(188, 9, ROCK);
			setBlock(188, 10, ROCK);
			setBlock(188, 11, ROCK);
			setBlock(188, 12, ROCK);
			setBlock(188, 13, HILL_TOP);
			setBlock(188, 14, GROUND);
			setBlock(189, 13, HILL_TOP);
			setBlock(189, 14, GROUND);
			setBlock(190, 13, HILL_TOP);
			setBlock(190, 14, GROUND);
			setBlock(191, 13, HILL_TOP);
			setBlock(191, 14, GROUND);
			setBlock(192, 13, HILL_TOP);
			setBlock(192, 14, GROUND);
			setBlock(193, 13, HILL_TOP);
			setBlock(193, 14, GROUND);
			setBlock(194, 13, HILL_TOP);
			setBlock(194, 14, GROUND);
			setBlock(195, 13, HILL_TOP);
			setBlock(195, 14, GROUND);
			setBlock(196, 13, HILL_TOP);
			setBlock(196, 14, GROUND);
			setBlock(197, 12, ROCK);
			setBlock(197, 13, HILL_TOP);
			setBlock(197, 14, GROUND);
			setBlock(198, 13, HILL_TOP);
			setBlock(198, 14, GROUND);
			setBlock(199, 13, HILL_TOP);
			setBlock(199, 14, GROUND);
			setBlock(200, 13, HILL_TOP);
			setBlock(200, 14, GROUND);
			setBlock(201, 13, HILL_TOP);
			setBlock(201, 14, GROUND);
			setBlock(202, 13, HILL_TOP);
			setBlock(202, 14, GROUND);
			setBlock(203, 13, HILL_TOP);
			setBlock(203, 14, GROUND);
			setBlock(204, 13, HILL_TOP);
			setBlock(204, 14, GROUND);
			xExit = 198;
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
