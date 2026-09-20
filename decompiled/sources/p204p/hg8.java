package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public enum hg8 {
    UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(1),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID(2),
    /* JADX INFO: Fake field, exist only in values array */
    TV_OS(3),
    /* JADX INFO: Fake field, exist only in values array */
    APPLE_WATCH(4),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_WEAR(5),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_WINDOWS(6),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_MACOS(7),
    /* JADX INFO: Fake field, exist only in values array */
    DESKTOP_LINUX(8),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_AUTOMOTIVE(9),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_TV(10),
    /* JADX INFO: Fake field, exist only in values array */
    SPEAKER(11),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER_TV(12),
    /* JADX INFO: Fake field, exist only in values array */
    AVR(13),
    /* JADX INFO: Fake field, exist only in values array */
    STB(14),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_CONSOLE(15),
    /* JADX INFO: Fake field, exist only in values array */
    AUTOMOBILE(16);


    /* JADX INFO: renamed from: a */
    public final int f91059a;

    hg8(int i) {
        this.f91059a = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m47424a() {
        switch (this) {
            case UNKNOWN:
                return "unknown";
            case IOS:
                return "ios";
            case ANDROID:
                return "android";
            case TV_OS:
                return "tvos";
            case APPLE_WATCH:
                return "apple_watch";
            case ANDROID_WEAR:
                return "android_wear";
            case DESKTOP_WINDOWS:
                return "desktop_windows";
            case DESKTOP_MACOS:
                return "desktop_macos";
            case DESKTOP_LINUX:
                return "desktop_linux";
            case ANDROID_AUTOMOTIVE:
                return "android_automotive";
            case ANDROID_TV:
                return "android_tv";
            case SPEAKER:
                return "speaker";
            case OTHER_TV:
                return "other_tv";
            case AVR:
                return "avr";
            case STB:
                return "stb";
            case GAME_CONSOLE:
                return "game_console";
            case AUTOMOBILE:
                return "automobile";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
