package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vx20 {

    /* JADX INFO: renamed from: a */
    public final ljx0 f245607a;

    /* JADX INFO: renamed from: b */
    public final lub f245608b = new lub(this, 4);

    /* JADX INFO: renamed from: c */
    public final wg61 f245609c;

    public vx20(ljx0 ljx0Var) {
        this.f245609c = new wg61(new mub(ljx0Var, 4));
        this.f245607a = ljx0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final int m86628a(vx20 vx20Var, String str) {
        vx20Var.getClass();
        switch (str.hashCode()) {
            case -1632865838:
                if (str.equals("PLAYLIST")) {
                    return 7;
                }
                break;
            case -1319760993:
                if (str.equals("AUDIOBOOK")) {
                    return 3;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    return 1;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    return 6;
                }
                break;
            case 80083243:
                if (str.equals("TRACK")) {
                    return 9;
                }
                break;
            case 81556047:
                if (str.equals("VENUE")) {
                    return 12;
                }
                break;
            case 408556937:
                if (str.equals("PROFILE")) {
                    return 8;
                }
                break;
            case 1669006982:
                if (str.equals("CONCERT")) {
                    return 11;
                }
                break;
            case 1868332626:
                if (str.equals("AUDIO_EPISODE")) {
                    return 4;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    return 2;
                }
                break;
            case 1941968267:
                if (str.equals("AUTHOR")) {
                    return 10;
                }
                break;
            case 2063976934:
                if (str.equals("AUDIO_SHOW")) {
                    return 5;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }
}
