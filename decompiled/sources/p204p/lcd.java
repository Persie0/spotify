package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lcd {

    /* JADX INFO: renamed from: a */
    public static final lcd f131901a;

    /* JADX INFO: renamed from: b */
    public static final lcd f131902b;

    /* JADX INFO: renamed from: c */
    public static final lcd f131903c;

    /* JADX INFO: renamed from: d */
    public static final lcd f131904d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ lcd[] f131905e;

    static {
        lcd lcdVar = new lcd("SongsAndMore", 0);
        f131901a = lcdVar;
        lcd lcdVar2 = new lcd("PhotosAndVideos", 1);
        f131902b = lcdVar2;
        lcd lcdVar3 = new lcd("LyricsStickers", 2);
        f131903c = lcdVar3;
        lcd lcdVar4 = new lcd("Gifs", 3);
        f131904d = lcdVar4;
        f131905e = new lcd[]{lcdVar, lcdVar2, lcdVar3, lcdVar4};
    }

    public static lcd valueOf(String str) {
        return (lcd) Enum.valueOf(lcd.class, str);
    }

    public static lcd[] values() {
        return (lcd[]) f131905e.clone();
    }
}
