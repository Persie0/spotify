package p204p;

import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontWeight;
import com.spotify.music.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF59' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class osu0 {

    /* JADX INFO: renamed from: d */
    public static final ajp0 f168896d;

    /* JADX INFO: renamed from: e */
    public static final osu0 f168897e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ osu0[] f168898f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ nzv f168899g;

    /* JADX INFO: renamed from: a */
    public final FontFamily f168900a;

    /* JADX INFO: renamed from: b */
    public final String f168901b;

    /* JADX INFO: renamed from: c */
    public final String f168902c;

    /* JADX INFO: Fake field, exist only in values array */
    osu0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    osu0 EF59;

    static {
        FontWeight fontWeight = FontWeight.f524b;
        osu0 osu0Var = new osu0("Spotify", 0, g0b1.m43263d(k0e1.m54984c(R.font.spotify_mix_ui_regular, jcg1.m52995o()), k0e1.m54984c(R.font.spotify_mix_ui_bold, jcg1.m52993m())), "", "");
        w310 w310Var = FontFamily.f513c;
        osu0[] osu0VarArr = {osu0Var, new osu0("Lora", 1, w310Var, "https://github.com/google/fonts/raw/main/ofl/lora/Lora%5Bwght%5D.ttf", "lora.ttf"), new osu0("Bitter", 2, w310Var, "https://github.com/google/fonts/raw/main/ofl/bitter/Bitter%5Bwght%5D.ttf", "bitter.ttf"), new osu0("IbmPlexSans", 3, FontFamily.f512b, "https://raw.githubusercontent.com/IBM/plex/main/packages/plex-sans/fonts/complete/ttf/IBMPlexSans-Regular.ttf", "ibm_plex_sans.ttf")};
        f168898f = osu0VarArr;
        f168899g = new nzv(osu0VarArr);
        f168896d = new ajp0();
        f168897e = osu0Var;
    }

    public osu0(String str, int i, FontFamily fontFamily, String str2, String str3) {
        super(str, i);
        this.f168900a = fontFamily;
        this.f168901b = str2;
        this.f168902c = str3;
    }

    public static osu0 valueOf(String str) {
        return (osu0) Enum.valueOf(osu0.class, str);
    }

    public static osu0[] values() {
        return (osu0[]) f168898f.clone();
    }
}
