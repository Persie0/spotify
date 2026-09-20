package p204p;

import com.google.android.gms.common.api.Scope;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fd11 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ fd11 f68296b = new fd11(25);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fd11 f68297c = new fd11(26);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68298a;

    public /* synthetic */ fd11(int i) {
        this.f68298a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i = 0;
        switch (this.f68298a) {
            case 0:
                cb11 cb11Var = (cb11) obj;
                cb11 cb11Var2 = (cb11) obj2;
                return jlg1.m53703m(Float.valueOf((cb11Var.f35971b.m84031v() == 0.0f && cb11Var.f35967X == null) ? -1.0f : cb11Var.f35971b.m84031v()), Float.valueOf((cb11Var2.f35971b.m84031v() == 0.0f && cb11Var2.f35967X == null) ? -1.0f : cb11Var2.f35971b.m84031v()));
            case 1:
                return jlg1.m53703m(Long.valueOf(((zh11) obj).f282780o), Long.valueOf(((zh11) obj2).f282780o));
            case 2:
                return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
            case 3:
                return jlg1.m53703m(Long.valueOf(((l031) obj).f128289b), Long.valueOf(((l031) obj2).f128289b));
            case 4:
                return jlg1.m53703m(Boolean.valueOf(((cye) obj).f43235e == null), Boolean.valueOf(((cye) obj2).f43235e == null));
            case 5:
                return jlg1.m53703m((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return jlg1.m53703m(Long.valueOf(((p3b) ((Map.Entry) obj).getValue()).f173602c), Long.valueOf(((p3b) ((Map.Entry) obj2).getValue()).f173602c));
            case 7:
                return jlg1.m53703m(Integer.valueOf(((lc41) obj2).f131825b.f195382k), Integer.valueOf(((lc41) obj).f131825b.f195382k));
            case 8:
                return jlg1.m53703m(Integer.valueOf(((tz41) ((Map.Entry) obj).getKey()).f225151b), Integer.valueOf(((tz41) ((Map.Entry) obj2).getKey()).f225151b));
            case 9:
                return jlg1.m53703m((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 10:
                return jlg1.m53703m(Boolean.valueOf(((r751) obj2).f196444b), Boolean.valueOf(((r751) obj).f196444b));
            case 11:
                return jlg1.m53703m(((eo61) obj).f61324a, ((eo61) obj2).f61324a);
            case 12:
                return jlg1.m53703m(((go61) obj).f82891a, ((go61) obj2).f82891a);
            case 13:
                return jlg1.m53703m(Integer.valueOf(((zu71) obj).f286384b), Integer.valueOf(((zu71) obj2).f286384b));
            case 14:
                return jlg1.m53703m(Integer.valueOf(((hc71) obj).f89712a), Integer.valueOf(((hc71) obj2).f89712a));
            case 15:
                return jlg1.m53703m(Long.valueOf(((doc) obj).f51008a), Long.valueOf(((doc) obj2).f51008a));
            case 16:
                String str = ((pla1) obj).f178682b;
                Locale locale = Locale.ROOT;
                return jlg1.m53703m(str.toLowerCase(locale), ((pla1) obj2).f178682b.toLowerCase(locale));
            case 17:
                return jlg1.m53703m(((i9b1) ((iuj) obj).f105977b).f99976Y, ((i9b1) ((iuj) obj2).f105977b).f99976Y);
            case 18:
                return jlg1.m53703m(((v4c1) obj).f237117b, ((v4c1) obj2).f237117b);
            case 19:
                return jlg1.m53703m(Integer.valueOf(((s4c1) obj2).f205570d), Integer.valueOf(((s4c1) obj).f205570d));
            case 20:
                return jlg1.m53703m(((VideoSurfaceView) obj2).getPriority(), ((VideoSurfaceView) obj).getPriority());
            case 21:
                return ((ckc1) obj).f38919a - ((ckc1) obj2).f38919a;
            case 22:
                return jlg1.m53703m(Integer.valueOf(((hne1) obj).f93324a), Integer.valueOf(((hne1) obj2).f93324a));
            case 23:
                return jlg1.m53703m(Integer.valueOf(((jne1) obj).f114098a), Integer.valueOf(((jne1) obj2).f114098a));
            case 24:
                return jlg1.m53703m(((dze1) obj).f54643a, ((dze1) obj2).f54643a);
            case 25:
                return ((Scope) obj).f1836b.compareTo(((Scope) obj2).f1836b);
            case 26:
                gey geyVar = (gey) obj2;
                gey geyVar2 = (gey) obj;
                return !geyVar2.f79230a.equals(geyVar.f79230a) ? geyVar2.f79230a.compareTo(geyVar.f79230a) : Long.compare(geyVar2.m44535k(), geyVar.m44535k());
            case 27:
                return ((Scope) obj).f1836b.compareTo(((Scope) obj2).f1836b);
            case 28:
                return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
            default:
                h6h1 h6h1Var = (h6h1) obj;
                h6h1 h6h1Var2 = (h6h1) obj2;
                int i2 = 0;
                while (true) {
                    length = h6h1Var.f88099a.length;
                    if (i < length && i2 < h6h1Var2.f88099a.length) {
                        int iCompare = Integer.compare(h6h1.m46725f(h6h1Var.m46727b(i)), h6h1.m46725f(h6h1Var2.m46727b(i2)));
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        i++;
                        i2++;
                    }
                }
                return Integer.compare(length, h6h1Var2.f88099a.length);
        }
    }
}
