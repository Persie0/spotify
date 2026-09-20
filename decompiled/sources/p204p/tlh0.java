package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class tlh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f221474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f221475b;

    public tlh0(g4h0 g4h0Var, int i, Integer num, int i2) {
        String str;
        String str2;
        this.f221475b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        switch (i) {
            case 1:
                str = "listening_time";
                break;
            case 2:
                str = "social_listening_time";
                break;
            case 3:
                str = "social_top_artists";
                break;
            case 4:
                str = "social_top_tracks";
                break;
            case 5:
                str = "top_artists";
                break;
            case 6:
                str = "top_tracks";
                break;
            default:
                throw null;
        }
        String str3 = str;
        switch (i2) {
            case 1:
                str2 = "la_disabled";
                break;
            case 2:
                str2 = "la_enabled_has_data_friends_playing";
                break;
            case 3:
                str2 = "la_enabled_has_data_no_friends_playing";
                break;
            case 4:
                str2 = "la_enabled_no_data_friends_playing";
                break;
            case 5:
                str2 = "la_enabled_no_data_no_friends_playing";
                break;
            case 6:
                str2 = "non_social";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("stats_tiles_item", str3, num, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f221474a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((vch0) this.f221475b.f76422c).f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f221474a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f221474a;
        nu91Var.f248108b = ((vch0) this.f221475b.f76422c).f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
