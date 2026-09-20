package p204p;

import android.view.View;
import com.spotify.libs.connect.events.proto.ConnectDeviceDiscoverySnapshot;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class hwd implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95913a;

    public /* synthetic */ hwd(int i) {
        this.f95913a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 0;
        switch (this.f95913a) {
            case 0:
                String str = ((pla1) obj).f178682b;
                Locale locale = Locale.ROOT;
                return jlg1.m53703m(str.toLowerCase(locale), ((pla1) obj2).f178682b.toLowerCase(locale));
            case 1:
                return jlg1.m53703m(Boolean.valueOf(((br51) obj2).f29973c), Boolean.valueOf(((br51) obj).f29973c));
            case 2:
                return jlg1.m53703m(txq.m81934g((nfe) obj).f269048a.f279080a, txq.m81934g((nfe) obj2).f269048a.f279080a);
            case 3:
                return jlg1.m53703m(Integer.valueOf(((are) obj).f19039b), Integer.valueOf(((are) obj2).f19039b));
            case 4:
                return ((c7f) obj2).m31706b() - ((c7f) obj).m31706b();
            case 5:
                return jlg1.m53703m((Comparable) ((Map.Entry) obj2).getValue(), (Comparable) ((Map.Entry) obj).getValue());
            case 6:
                foo fooVar = ((luh) obj).f137092c.f240988a;
                String str2 = fooVar.f71574a;
                bno bnoVar = bno.f28901j;
                lba0 lba0VarM58644y6 = lba0.m58644y6(str2, bnoVar);
                hze1 hze1Var = hze1.f96907f;
                lba0VarM58644y6.getClass();
                d4l0 d4l0VarM34925s6 = new d4l0(lba0VarM58644y6, hze1Var).m34925s6(fooVar.f71575b);
                foo fooVar2 = ((luh) obj2).f137092c.f240988a;
                lba0 lba0VarM58644y7 = lba0.m58644y6(fooVar2.f71574a, bnoVar);
                lba0VarM58644y7.getClass();
                return jlg1.m53703m(d4l0VarM34925s6, new d4l0(lba0VarM58644y7, hze1Var).m34925s6(fooVar2.f71575b));
            case 7:
                return jlg1.m53703m(Boolean.valueOf(((e07) obj2).f54888c), Boolean.valueOf(((e07) obj).f54888c));
            case 8:
                d3h1 d3h1VarM94498m = ysj0.m94498m((f5k) obj2);
                z4k z4kVar = z4k.f279256b;
                return jlg1.m53703m(Boolean.valueOf(wj50.m88271j(d3h1VarM94498m, z4kVar)), Boolean.valueOf(wj50.m88271j(ysj0.m94498m((f5k) obj), z4kVar)));
            case 9:
                return jlg1.m53703m((gnk) ((pqm0) obj2).f180350a, (gnk) ((pqm0) obj).f180350a);
            case 10:
                return jlg1.m53703m(Long.valueOf(((hnk) obj2).f93354d), Long.valueOf(((hnk) obj).f93354d));
            case 11:
                WeakHashMap weakHashMap = mec1.f142677a;
                float fM32543g = cec1.m32543g((View) obj);
                float fM32543g2 = cec1.m32543g((View) obj2);
                if (fM32543g > fM32543g2) {
                    return -1;
                }
                return fM32543g < fM32543g2 ? 1 : 0;
            case 12:
                return jlg1.m53703m(Integer.valueOf(((n0m) obj).f149113c), Integer.valueOf(((n0m) obj2).f149113c));
            case 13:
                return jlg1.m53703m(Boolean.valueOf(((fgr) obj2).f69391f), Boolean.valueOf(((fgr) obj).f69391f));
            case 14:
                return jlg1.m53703m(Boolean.valueOf(((fgr) obj2).f69391f), Boolean.valueOf(((fgr) obj).f69391f));
            case 15:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                int length = str4.length() - str3.length();
                return length == 0 ? str3.compareTo(str4) : length;
            case 16:
                return jlg1.m53703m(((ej9) obj).f60160a, ((ej9) obj2).f60160a);
            case 17:
                return jlg1.m53703m(((ej9) obj).f60160a, ((ej9) obj2).f60160a);
            case 18:
                return jlg1.m53703m(Long.valueOf(((pck) obj2).f176150d), Long.valueOf(((pck) obj).f176150d));
            case 19:
                return jlg1.m53703m(((ConnectDeviceDiscoverySnapshot) obj).m12730e0(), ((ConnectDeviceDiscoverySnapshot) obj2).m12730e0());
            case 20:
                return jlg1.m53703m(((ConnectDeviceDiscoverySnapshot) obj).m12730e0(), ((ConnectDeviceDiscoverySnapshot) obj2).m12730e0());
            case 21:
                mb90 mb90Var = ((nb90) obj2).f152221b;
                Long l = mb90Var != null ? mb90Var.f141841d : null;
                mb90 mb90Var2 = ((nb90) obj).f152221b;
                return jlg1.m53703m(l, mb90Var2 != null ? mb90Var2.f141841d : null);
            case 22:
                qle0 qle0Var = ((ntt0) ((pqm0) obj).f180350a).f158148a.f283727a;
                List list = qvx.f193134a;
                return jlg1.m53703m(Integer.valueOf(list.indexOf(qle0Var)), Integer.valueOf(list.indexOf(((ntt0) ((pqm0) obj2).f180350a).f158148a.f283727a)));
            case 23:
                return jlg1.m53703m(((hr60) obj).getName(), ((hr60) obj2).getName());
            case 24:
                return jlg1.m53703m(Integer.valueOf(((fg8) obj).ordinal()), Integer.valueOf(((fg8) obj2).ordinal()));
            case 25:
                za5 za5Var = ((ib5) obj).f100436a;
                za5 za5Var2 = ((ib5) obj2).f100436a;
                return jlg1.m53703m("default", "default");
            case 26:
                icr0 icr0Var = (icr0) obj;
                if (icr0Var instanceof hcr0) {
                    i = 0;
                } else {
                    i = icr0Var instanceof gcr0 ? 1 : 2;
                }
                Integer numValueOf = Integer.valueOf(i);
                icr0 icr0Var2 = (icr0) obj2;
                if (!(icr0Var2 instanceof hcr0)) {
                    i2 = icr0Var2 instanceof gcr0 ? 1 : 2;
                }
                return jlg1.m53703m(numValueOf, Integer.valueOf(i2));
            case 27:
                return jlg1.m53703m(Integer.valueOf(((d0w) obj2).f44093y), Integer.valueOf(((d0w) obj).f44093y));
            case 28:
                return jlg1.m53703m(Long.valueOf(((pck) obj2).f176150d), Long.valueOf(((pck) obj).f176150d));
            default:
                return jlg1.m53703m(Integer.valueOf(((iry) obj2).f105068b.f195382k), Integer.valueOf(((iry) obj).f105068b.f195382k));
        }
    }

    public hwd(ct3 ct3Var) {
        this.f95913a = 6;
    }
}
