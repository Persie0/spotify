package p204p;

import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class cx7 implements qh00 {

    /* JADX INFO: renamed from: b */
    public static final cx7 f42931b = new cx7(0);

    /* JADX INFO: renamed from: c */
    public static final cx7 f42932c = new cx7(1);

    /* JADX INFO: renamed from: d */
    public static final cx7 f42933d = new cx7(2);

    /* JADX INFO: renamed from: e */
    public static final cx7 f42934e = new cx7(3);

    /* JADX INFO: renamed from: f */
    public static final cx7 f42935f = new cx7(4);

    /* JADX INFO: renamed from: g */
    public static final cx7 f42936g = new cx7(5);

    /* JADX INFO: renamed from: h */
    public static final cx7 f42937h = new cx7(6);

    /* JADX INFO: renamed from: i */
    public static final cx7 f42938i = new cx7(7);

    /* JADX INFO: renamed from: j */
    public static final cx7 f42939j = new cx7(8);

    /* JADX INFO: renamed from: k */
    public static final cx7 f42940k = new cx7(9);

    /* JADX INFO: renamed from: l */
    public static final cx7 f42941l = new cx7(10);

    /* JADX INFO: renamed from: m */
    public static final cx7 f42942m = new cx7(11);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42943a;

    public cx7() {
        this.f42943a = 12;
        Set set = dd41.f47702f;
    }

    @Override // p204p.qh00
    public final Object apply(Object obj) {
        switch (this.f42943a) {
            case 0:
                return Boolean.valueOf(((v3a0) obj) instanceof p3a0);
            case 1:
                return ((ContextTrack) obj).uri();
            case 2:
                return ((ContextTrack) obj).uri();
            case 3:
                return ((ContextTrack) obj).metadata();
            case 4:
                return ((ContextTrack) obj).uri();
            case 5:
                return ((ContextTrack) obj).uri();
            case 6:
                return ((ContextTrack) obj).uri();
            case 7:
                return ((ContextTrack) obj).provider();
            case 8:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (contextTrack != null) {
                    return contextTrack.uid();
                }
                return null;
            case 9:
                ContextTrack contextTrack2 = (ContextTrack) obj;
                if (contextTrack2 != null) {
                    return contextTrack2.uri();
                }
                return null;
            case 10:
                ContextTrack contextTrack3 = (ContextTrack) obj;
                wj50.m88279p(contextTrack3);
                return Boolean.valueOf(e72.m37988V(contextTrack3));
            case 11:
                return Boolean.valueOf(e72.m37976J((ContextTrack) obj));
            case 12:
                Set set = dd41.f47702f;
                return r46.m74726U((String) obj);
            default:
                xj30 xj30Var = (xj30) obj;
                xj30Var.getClass();
                int iOrdinal = xj30Var.ordinal();
                if (iOrdinal == 0) {
                    kn30 kn30Var = on30.f167145b;
                    return Integer.valueOf(R.id.hub_glue_card_title_subtitle);
                }
                if (iOrdinal == 1) {
                    return Integer.valueOf(co30.f40161X);
                }
                if (iOrdinal == 2) {
                    so30 so30Var = op30.f167743b;
                    dp30 dp30Var = mp30.f145844b;
                    return Integer.valueOf(R.id.hub_glue_row_two_line);
                }
                if (iOrdinal == 3) {
                    xp30 xp30Var = iq30.f104622b;
                    hq30[] hq30VarArr = hq30.f94012b;
                    return Integer.valueOf(R.id.hub_glue_section_header_large);
                }
                if (iOrdinal != 4) {
                    throw new AssertionError("Category without a default: ".concat(String.valueOf(xj30Var)));
                }
                nj30.f154428c.getClass();
                return Integer.valueOf(R.id.hub_common_loading_view);
        }
    }

    public /* synthetic */ cx7(int i) {
        this.f42943a = i;
    }
}
