package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qtr implements bex {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192444a;

    public /* synthetic */ qtr(int i) {
        this.f192444a = i;
    }

    @Override // p204p.bex
    /* JADX INFO: renamed from: a */
    public final Map mo28968a() {
        int i = this.f192444a;
        nau nauVar = nau.f152117a;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return nauVar;
            case 4:
                return kkc0.m56695h0(new pqm0(1, edb.m38574w(ycs0.class)), new pqm0(2, bk5.m29624m1(new gww0[]{new fww0(x430.class), new eww0(yfj.class)})));
            default:
                return nauVar;
        }
    }

    @Override // p204p.bex
    /* JADX INFO: renamed from: b */
    public final Integer mo28969b() {
        switch (this.f192444a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return 24;
            default:
                return 11;
        }
    }
}
