using UnityEngine;
using System.Collections;

public class Level33Script : MonoBehaviour {

	// Use this for initialization
	void Start () {
		Map map = gameObject.GetComponent<Map> ();

		map.SetBlock(4, 5, Map.QUESTION);
		map.SetBlock(5, 5, Map.QUESTION);

		map.SetBlock(84, 5, Map.STAIR);
		map.SetBlock(85, 5, Map.STAIR);
		map.SetBlock(86, 5, Map.STAIR);
		map.SetBlock(54, 3, Map.STAIR);
		map.SetBlock(55, 3, Map.STAIR);
		map.SetBlock(56, 3, Map.STAIR);

		map.SetBlock(101, 6, Map.STAIR);
		map.SetBlock(102, 6, Map.STAIR);
		map.SetBlock(103, 6, Map.STAIR);


		map.SetBlock(142, 6, Map.STAIR);
		map.SetBlock(143, 6, Map.STAIR);
		map.SetBlock(144, 6, Map.STAIR);
		map.SetBlock(145, 6, Map.STAIR);

		map.SetBlock(131, 5, Map.STAIR);
		map.SetBlock(132, 5, Map.STAIR);
		map.SetBlock(133, 5, Map.STAIR);
		map.SetBlock(134, 5, Map.STAIR);



		map.SetBlock(59, 7, Map.STAIR);
		map.SetBlock(60, 7, Map.STAIR);
		map.SetBlock(61, 7, Map.STAIR);
		map.SetSprite(91, 2, Map.GREEN_KOOPA);
		map.SetBlock(177, 1, Map.HILLTOP);
		map.SetBlock(177, 0, Map.GROUND);
		map.SetBlock(178, 1, Map.HILLTOP);
		map.SetBlock(178, 0, Map.GROUND);
		map.SetBlock(179, 1, Map.HILLTOP);
		map.SetBlock(179, 0, Map.GROUND);

		map.SetBlock(50, 10, Map.PIPE_BODY_LEFT);
		map.SetBlock(51, 10, Map.PIPE_BODY_RIGHT);







		map.SetBlock(138, 0, Map.PIPE_BODY_LEFT);
		map.SetBlock(139, 0, Map.PIPE_BODY_RIGHT);
		map.SetBlock(138, 1, Map.PIPE_BODY_LEFT);
		map.SetBlock(139, 1, Map.PIPE_BODY_RIGHT);
		map.SetBlock(138, 3, Map.PIPE_TOP_LEFT);
		map.SetBlock(139, 3, Map.PIPE_TOP_RIGHT);
		map.SetBlock(138, 2, Map.PIPE_BODY_LEFT);
		map.SetBlock(139, 2, Map.PIPE_BODY_RIGHT);

		//Second to last pipe
		map.SetBlock(165, 4, Map.PIPE_TOP_LEFT);
		map.SetBlock(166, 4, Map.PIPE_TOP_RIGHT);
		map.SetBlock(165, 3, Map.PIPE_BODY_LEFT);
		map.SetBlock(166, 3, Map.PIPE_BODY_RIGHT);
		map.SetBlock(165, 2, Map.PIPE_BODY_LEFT);
		map.SetBlock(166, 2, Map.PIPE_BODY_RIGHT);
		map.SetBlock(165, 0, Map.PIPE_BODY_LEFT);
		map.SetBlock(166, 0, Map.PIPE_BODY_RIGHT);
		map.SetBlock(165, 1, Map.PIPE_BODY_LEFT);
		map.SetBlock(166, 1, Map.PIPE_BODY_RIGHT);

		map.SetBlock(159, 0, Map.PIPE_BODY_LEFT);
		map.SetBlock(160, 0, Map.PIPE_BODY_RIGHT);

		map.SetBlock(159, 1, Map.PIPE_BODY_LEFT);
		map.SetBlock(160, 1, Map.PIPE_BODY_RIGHT);

		map.SetBlock(50, 11, Map.PIPE_TOP_LEFT);
		map.SetBlock(51, 11, Map.PIPE_TOP_RIGHT);


		map.SetBlock(159, 2, Map.PIPE_TOP_LEFT);
		map.SetBlock(160, 2, Map.PIPE_TOP_RIGHT);
		map.SetSprite(51, 12, Map.PLANT);
		map.SetSprite(70, 4, Map.PLANT);
		map.SetSprite(76, 4, Map.PLANT);
		map.SetBlock(95, 12, Map.QUESTION);
		map.SetBlock(96, 12, Map.QUESTION);
		map.SetSprite(19, 10, Map.RED_KOOPA);
		map.SetSprite(43, 6, Map.RED_KOOPA);
		map.SetSprite(115, 6, Map.RED_KOOPA);
		map.SetSprite(35, 2, Map.RED_KOOPA);
		map.SetSprite(37, 2, Map.RED_KOOPA);
		map.SetSprite(38, 2, Map.RED_KOOPA);










		map.SetBlock(26, 1, Map.HILLTOP);



		map.SetBlock(107, 1, Map.HILLTOP);
		map.SetBlock(108, 1, Map.HILLTOP);//new
		map.SetBlock(24, 9, Map.HILLTOP);
		map.SetBlock(52, 9, Map.HILLTOP);


		map.SetBlock(79, 9, Map.HILLTOP);
		map.SetBlock(97, 9, Map.HILLTOP);
		map.SetBlock(171, 9, Map.HILLTOP);
		map.SetBlock(26, 5, Map.HILLTOP);
		map.SetBlock(46, 5, Map.HILLTOP);
		map.SetBlock(117, 5, Map.HILLTOP);
		map.SetBlock(126, 5, Map.HILLTOP);


	
		map.SetBlock(10, 1, Map.HILLTOP);
		map.SetBlock(41, 1, Map.HILLTOP);
		map.SetBlock(71, 1, Map.HILLTOP);

		map.SetBlock(92, 1, Map.HILLTOP);


		//Top Hill 2
		map.SetBlock(14, 9, Map.HILLLEFTB);
		map.SetBlock(15, 9, Map.HILLTOP);
		map.SetBlock(16, 9, Map.HILLTOP);
		map.SetBlock(17, 9, Map.HILLTOP);
		map.SetBlock(18, 9, Map.HILLTOP);
		map.SetBlock(19, 9, Map.HILLTOP);
		map.SetBlock(20, 9, Map.HILLTOP);
		map.SetBlock(21, 9, Map.HILLTOP);
		map.SetBlock(22, 9, Map.HILLTOP);
		map.SetBlock(23, 9, Map.HILLTOP);
		map.SetBlock(24, 9, Map.HILLRIGHTB);
		for (int y = 6; y < 9; y++) {
			map.SetBlock(14, y, Map.GROUNDLEFT);
			map.SetBlock(24, y, Map.GROUNDRIGHT);

			for (int x = 15; x < 24; x++) {
				if (y == 6) {
					map.SetBlock (x, y, Map.GROUNDBOTTOM);
				} else {
					map.SetBlock (x, y, Map.GROUND);
				}
			}
		}
		map.SetBlock (14, 6, Map.GROUNDLEFTBOTTOM);
		map.SetBlock (24, 6, Map.GROUNDRIGHTBOTTOM);

		//Hill 6
		map.SetBlock(48, 9, Map.HILLLEFTB);
		map.SetBlock(49, 9, Map.HILLTOP);
		map.SetBlock(50, 9, Map.HILLTOP);
		map.SetBlock(51, 9, Map.HILLTOP);
		map.SetBlock(52, 9, Map.HILLRIGHTB);
		for (int y = 0; y < 9; y++) {
			map.SetBlock(48, y, Map.GROUNDLEFT);
			map.SetBlock(52, y, Map.GROUNDRIGHT);

			for (int x = 49; x < 52; x++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 7
		map.SetBlock(65, 9, Map.HILLLEFTB);
		map.SetBlock(66, 9, Map.HILLTOP);
		map.SetBlock(67, 9, Map.HILLTOP);
		map.SetBlock(68, 9, Map.HILLTOP);//new
		map.SetBlock(69, 9, Map.HILLRIGHTB);//new
		for (int y = 0; y < 9; y++) {
			map.SetBlock(65, y, Map.GROUNDLEFT);
			map.SetBlock(69, y, Map.GROUNDRIGHT);

			for (int x = 66; x < 69; x++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 10
		map.SetBlock(75, 9, Map.HILLLEFTB);
		map.SetBlock(76, 9, Map.HILLTOP);
		map.SetBlock(77, 9, Map.HILLTOP);
		map.SetBlock(78, 9, Map.HILLTOP);
		map.SetBlock(79, 9, Map.HILLRIGHTB);
		for (int y = 0; y < 9; y++) {
			map.SetBlock(75, y, Map.GROUNDLEFT);
			map.SetBlock(79, y, Map.GROUNDRIGHT);

			for (int x = 76; x < 79; x++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 12
		map.SetBlock(94, 9, Map.HILLLEFTB);
		map.SetBlock(95, 9, Map.HILLTOP);
		map.SetBlock(96, 9, Map.HILLTOP);
		map.SetBlock(96, 9, Map.HILLTOP);
		map.SetBlock(97, 9, Map.HILLRIGHTB);
		for (int y = 0; y < 9; y++) {
			map.SetBlock(94, y, Map.GROUNDLEFT);
			map.SetBlock(97, y, Map.GROUNDRIGHT);

			for (int x = 95; x < 97; x++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 17
		map.SetBlock(169, 9, Map.HILLLEFTB);
		map.SetBlock(170, 9, Map.HILLTOP);
		map.SetBlock(171, 9, Map.HILLRIGHTB);
		for (int y = 0; y < 9; y++) {
			map.SetBlock(169, y, Map.GROUNDLEFT);
			map.SetBlock(171, y, Map.GROUNDRIGHT);

			for (int x = 170; x < 171; x++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//2nd hill
		map.SetBlock(11, 5, Map.HILLLEFTB);
		map.SetBlock(12, 5, Map.HILLTOP);//new
		map.SetBlock(13, 5, Map.HILLTOP);
		map.SetBlock(15, 5, Map.HILLTOP);
		map.SetBlock(16, 5, Map.HILLTOP);
		map.SetBlock(16, 5, Map.HILLTOP);
		map.SetBlock(17, 5, Map.HILLTOP);
		map.SetBlock(18, 5, Map.HILLTOP);
		map.SetBlock(19, 5, Map.HILLTOP);
		map.SetBlock(20, 5, Map.HILLTOP);
		map.SetBlock(21, 5, Map.HILLTOP);
		map.SetBlock(21, 5, Map.HILLTOP);
		map.SetBlock(23, 5, Map.HILLTOP);
		map.SetBlock(24, 5, Map.HILLTOP);
		map.SetBlock(25, 5, Map.HILLTOP);
		map.SetBlock(26, 5, Map.HILLRIGHTB);
		for (int y = 0; y < 5; y++) {
			map.SetBlock(11, y, Map.GROUNDLEFT);
			map.SetBlock(26, y, Map.GROUNDRIGHT);
		}
		for (int x = 12; x < 26; x++) {
			for (int y = 0; y < 5; y++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 5
		map.SetBlock(42, 5, Map.HILLLEFTB);
		map.SetBlock(43, 5, Map.HILLTOP);//new
		map.SetBlock(44, 5, Map.HILLTOP);
		map.SetBlock(45, 5, Map.HILLTOP);
		map.SetBlock(46, 5, Map.HILLRIGHTB);
		for (int y = 0; y < 5; y++) {
			map.SetBlock(42, y, Map.GROUNDLEFT);
			map.SetBlock(46, y, Map.GROUNDRIGHT);
		}
		for (int x = 43; x < 46; x++) {
			for (int y = 0; y < 5; y++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 14
		map.SetBlock(112, 5, Map.HILLLEFTB);
		map.SetBlock(113, 5, Map.HILLTOP);
		map.SetBlock(114, 5, Map.HILLTOP);
		map.SetBlock(115, 5, Map.HILLTOP);
		map.SetBlock(116, 5, Map.HILLTOP);
		map.SetBlock(117, 5, Map.HILLRIGHTB);
		for (int y = 0; y < 5; y++) {
			map.SetBlock(112, y, Map.GROUNDLEFT);
			map.SetBlock(117, y, Map.GROUNDRIGHT);
		}
		for (int x = 113; x < 117; x++) {
			for (int y = 0; y < 5; y++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 15
		map.SetBlock(122, 5, Map.HILLLEFTB);//new
		map.SetBlock(123, 5, Map.HILLTOP);
		map.SetBlock(124, 5, Map.HILLTOP);
		map.SetBlock(125, 5, Map.HILLTOP);
		map.SetBlock(126, 5, Map.HILLRIGHTB);
		for (int y = 0; y < 5; y++) {
			map.SetBlock(122, y, Map.GROUNDLEFT);
			map.SetBlock(126, y, Map.GROUNDRIGHT);
		}
		for (int x = 123; x < 126; x++) {
			for (int y = 0; y < 5; y++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 16
		map.SetBlock(150, 5, Map.HILLLEFTB);
		map.SetBlock(151, 5, Map.HILLTOP);
		map.SetBlock(152, 5, Map.HILLTOP);
		map.SetBlock(153, 5, Map.HILLTOP);
		map.SetBlock(154, 5, Map.HILLRIGHTB);
		for (int y = 0; y < 5; y++) {
			map.SetBlock(150, y, Map.GROUNDLEFT);
			map.SetBlock(154, y, Map.GROUNDRIGHT);
		}
		for (int x = 151; x < 154; x++) {
			for (int y = 0; y < 5; y++) {
				map.SetBlock (x, y, Map.GROUND);
			}
		}

		//Hill 1
		map.SetBlock(0, 1, Map.HILLTOPLEFT);
		map.SetBlock(0, 0, Map.HILLLEFT);
		map.SetBlock(1, 1, Map.HILLTOP);
		map.SetBlock(2, 1, Map.HILLTOP);//new
		map.SetBlock(3, 1, Map.HILLTOP);
		map.SetBlock(4, 1, Map.HILLTOP);
		map.SetBlock(5, 1, Map.HILLTOP);
		map.SetBlock(6, 1, Map.HILLTOP);
		map.SetBlock(8, 1, Map.HILLTOP);
		map.SetBlock(8, 1, Map.HILLTOP);
		map.SetBlock(9, 1, Map.HILLTOP);
		map.SetBlock(10, 1, Map.HILLTOPRIGHT);
		map.SetBlock(10, 0, Map.HILLRIGHT);
		for (int i = 1; i < 10; i++) {
			map.SetBlock (i, 0, Map.GROUND);
		}
			
		//Hill 3
		map.SetBlock(27, 1, Map.HILLTOPLEFT);
		map.SetBlock(27, 0, Map.HILLLEFT);
		map.SetBlock(28, 1, Map.HILLTOP);
		map.SetBlock(29, 1, Map.HILLTOP);
		map.SetBlock(31, 1, Map.HILLTOP);
		map.SetBlock(32, 1, Map.HILLTOP);
		map.SetBlock(33, 1, Map.HILLTOP);
		map.SetBlock(34, 1, Map.HILLTOP);
		map.SetBlock(35, 1, Map.HILLTOP);
		map.SetBlock(36, 1, Map.HILLTOP);
		map.SetBlock(37, 1, Map.HILLTOP);
		map.SetBlock(38, 1, Map.HILLTOP);
		map.SetBlock(39, 1, Map.HILLTOP);
		map.SetBlock(40, 1, Map.HILLTOP);
		map.SetBlock(41, 1, Map.HILLTOPRIGHT);
		map.SetBlock(41, 0, Map.HILLRIGHT);
		for (int i = 28; i < 41; i++) {
			map.SetBlock (i, 0, Map.GROUND);
		}


		//Little Hill 8 With Plant
		map.SetBlock(68, 0, Map.HILLLEFT);
		map.SetBlock(68, 1, Map.HILLTOPLEFT);
		map.SetBlock(69, 1, Map.HILLTOP);
		map.SetBlock(70, 1, Map.HILLTOP);
		map.SetBlock(71, 1, Map.HILLTOPRIGHT);
		map.SetBlock(71, 0, Map.HILLRIGHT);
		for (int x = 69; x < 71; x++) {
			map.SetBlock(x, 0, Map.GROUND);
		}
		map.SetBlock(69, 3, Map.PIPE_TOP_LEFT);
		map.SetBlock(70, 3, Map.PIPE_TOP_RIGHT);
		map.SetBlock(69, 2, Map.PIPE_BODY_LEFT);
		map.SetBlock(70, 2, Map.PIPE_BODY_RIGHT);

		//Little Hill 9 With Plant
		map.SetBlock(74, 1, Map.HILLTOPLEFT);
		map.SetBlock(74, 0, Map.HILLLEFT);
		map.SetBlock(75, 1, Map.HILLTOP);
		map.SetBlock(76, 1, Map.HILLTOP);
		map.SetBlock(77, 1, Map.HILLTOP);
		map.SetBlock(78, 1, Map.HILLTOP);
		map.SetBlock(79, 1, Map.HILLTOP);
		map.SetBlock(80, 1, Map.HILLTOP);
		map.SetBlock(81, 1, Map.HILLTOPRIGHT);
		map.SetBlock(81, 0, Map.HILLRIGHT);
		map.SetBlock(75, 3, Map.PIPE_TOP_LEFT);
		map.SetBlock(76, 3, Map.PIPE_TOP_RIGHT);
		map.SetBlock(75, 2, Map.PIPE_BODY_LEFT);
		map.SetBlock(76, 2, Map.PIPE_BODY_RIGHT);
		for (int x = 75; x < 81; x++) {
			map.SetBlock (x, 0, Map.GROUND);
		}

		//Hill 11
		map.SetBlock(89, 1, Map.HILLTOPLEFT);
		map.SetBlock(89, 0, Map.HILLLEFT);
		map.SetBlock(90, 1, Map.HILLTOP);
		map.SetBlock(90, 0, Map.GROUND);
		map.SetBlock(91, 1, Map.HILLTOP);
		map.SetBlock(91, 0, Map.GROUND);
		map.SetBlock(92, 1, Map.HILLTOPRIGHT);
		map.SetBlock(92, 0, Map.HILLRIGHT);

		//Hill 13
		map.SetBlock(107, 1, Map.HILLTOPLEFT);
		map.SetBlock(107, 0, Map.HILLLEFT);
		map.SetBlock(108, 1, Map.HILLTOP);
		map.SetBlock(108, 0, Map.GROUND);
		map.SetBlock(109, 1, Map.HILLTOP);
		map.SetBlock(109, 0, Map.GROUND);
		map.SetBlock(110, 1, Map.HILLTOP);
		map.SetBlock(110, 0, Map.GROUND);
		map.SetBlock(111, 1, Map.HILLTOPRIGHT);
		map.SetBlock(111, 0, Map.HILLRIGHT);


		//end section
		map.SetBlock(157, 9, Map.STAIR);
		map.SetBlock(158, 9, Map.STAIR);

		map.SetBlock(162, 9, Map.STAIR);
		map.SetBlock(163, 9, Map.STAIR);
		map.SetBlock(164, 9, Map.STAIR);
		map.SetBlock(17, 9, Map.HILLTOP);
		map.SetBlock(21, 9, Map.HILLTOP);
		map.SetBlock(22, 9, Map.HILLTOP);
		map.SetBlock(50, 9, Map.HILLTOP);
		map.SetBlock(14, 5, Map.HILLTOP);
		map.SetBlock(15, 5, Map.HILLTOP);
		map.SetBlock(20, 5, Map.HILLTOP);
		map.SetBlock(22, 5, Map.HILLTOP);
		map.SetBlock(25, 5, Map.HILLTOP);
		map.SetBlock(45, 5, Map.HILLTOP);
		map.SetBlock(115, 5, Map.HILLTOP);
		map.SetBlock(116, 5, Map.HILLTOP);
		map.SetBlock(7, 1, Map.HILLTOP);
		map.SetBlock(9, 1, Map.HILLTOP);
		map.SetBlock(30, 1, Map.HILLTOP);
		map.SetBlock(37, 1, Map.HILLTOP);
		map.SetBlock(38, 1, Map.HILLTOP);
		map.SetBlock(78, 1, Map.HILLTOP);

		map.SetBlock(96, 3, Map.STAIR);
		map.SetBlock(97, 3, Map.STAIR);
		map.SetBlock(98, 3, Map.STAIR);
		map.SetBlock(99, 3, Map.STAIR);
	}

}
