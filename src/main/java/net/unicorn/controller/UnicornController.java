package net.unicorn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicornController {

    @GetMapping("/unicorn")
    public String giveMeUnicorn() {
        return "<html><pre>" +
                "                               ,|\n" +
                "                             //|                              ,|\n" +
                "                           //,/                             -~ |\n" +
                "                         // / |                         _-~   /  ,\n" +
                "                       /'/ / /                       _-~   _/_-~ |\n" +
                "                      ( ( / /'                   _ -~     _-~ ,/'\n" +
                "                       \\~\\/'/|             __--~~__--\\ _-~  _/,\n" +
                "               ,,)))))));, \\/~-_     __--~~  --~~  __/~  _-~ /\n" +
                "            __))))))))))))));,>/\\   /        __--~~  \\-~~ _-~\n" +
                "           -\\(((((''''(((((((( >~\\/     --~~   __--~' _-~ ~|\n" +
                "  --==//////((''  .     `)))))), /     ___---~~  ~~\\~~__--~\n" +
                "          ))| @    ;-.     (((((/           __--~~~'~~/\n" +
                "          ( `|    /  )      )))/      ~~~~~__\\__---~~__--~~--_\n" +
                "             |   |   |       (/      ---~~~/__-----~~  ,;::'  \\         ,\n" +
                "             o_);   ;        /      ----~~/           \\,-~~~\\  |       /|\n" +
                "                   ;        (      ---~~/         `:::|      |;|      < >\n" +
                "                  |   _      `----~~~~'      /      `:|       \\;\\_____//\n" +
                "            ______/\\/~    |                 /        /         ~------~\n" +
                "          /~;;.____/;;'  /          ___----(   `;;;/\n" +
                "         / //  _;______;'------~~~~~    |;;/\\    /\n" +
                "        //  | |                        /  |  \\;;,\\\n" +
                "       (<_  | ;                      /',/-----'  _>\n" +
                "        \\_| ||_                     //~;~~~~~~~~~\n" +
                "            `\\_|                   (,~~\n" +
                "                                    \\~\\\n" +
                "                                     ~~\n" +
                "</pre><html>";
    }

    @GetMapping("/unicornWithRainbows")
    public String giveMeUnicornAndRainbows() {
        return "<html><pre>" +
                "                                                 ,/\n" +
                "                                                //\n" +
                "                                              ,//\n" +
                "                                  ___   /|   |//\n" +
                "                              `__/\\_ --(/|___/-/\n" +
                "                           \\|\\_-\\___ __-_`- /-/ \\.\n" +
                "                          |\\_-___,-\\_____--/_)' ) \\\n" +
                "                           \\ -_ /     __ \\( `( __`\\|\n" +
                "                           `\\__|      |\\)\\ ) /(/|                          _.-\"\"\"\"`-._\n" +
                "   ,._____.,            ',--//-|      \\  |  '   /                        ,' _-\"\"\"\"`-_ `.\n" +
                "  /     __. \\,          / /,---|       \\       /                        / ,'.-'\"\"\"`-.`. \\\n" +
                " / /    _. \\  \\        `/`_/ _,'        |     |                        | / / ,'\"\"\"`. \\ \\ |\n" +
                "|  | ( (  \\   |      ,/\\'__/'/          |     |                       | | | | ,'\"`. | | | |\n" +
                "|  \\  \\`--, `_/_------______/           \\(   )/                       | | | |       | | | |\n" +
                "| | \\  \\_. \\,                            \\___/\\\n" +
                "| |  \\_   \\  \\                                 \\\n" +
                "\\ \\    \\_ \\   \\   /                             \\\n" +
                " \\ \\  \\._  \\__ \\_|       |                       \\\n" +
                "  \\ \\___  \\      \\       |                        \\\n" +
                "   \\__ \\__ \\  \\_ |       \\                         |\n" +
                "   |  \\_____ \\  ____      |                        |\n" +
                "   | \\  \\__ ---' .__\\     |        |               |\n" +
                "   \\  \\__ ---   /   )     |        \\              /\n" +
                "    \\   \\____/ / ()(      \\          `---_       /|\n" +
                "     \\__________/(,--__    \\_________.    |    ./ |\n" +
                "       |     \\ \\  `---_\\--,           \\   \\_,./   |\n" +
                "       |      \\  \\_ ` \\    /`---_______-\\   \\\\    /\n" +
                "        \\      \\.___,`|   /              \\   \\\\   \\\n" +
                "         \\     |  \\_ \\|   \\              (   |:    |\n" +
                "          \\    \\      \\    |             /  / |    ;\n" +
                "           \\    \\      \\    \\          ( `_'   \\  |\n" +
                "            \\.   \\      \\.   \\          `__/   |  |\n" +
                "              \\   \\       \\.  \\                |  |\n" +
                "               \\   \\        \\  \\               (  )\n" +
                "                \\   |        \\  |              |  |\n" +
                "                 |  \\         \\ \\              I  `\n" +
                "                 ( __;        ( _;            ('-_';\n" +
                "                 |___\\        \\___:            \\___:" +
                "</pre><html>";
    }
}
