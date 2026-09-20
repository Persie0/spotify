package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qd40 {

    /* JADX INFO: renamed from: a */
    public final String f187478a;

    /* JADX INFO: renamed from: b */
    public final float f187479b;

    /* JADX INFO: renamed from: c */
    public final float f187480c;

    /* JADX INFO: renamed from: d */
    public final float f187481d;

    /* JADX INFO: renamed from: e */
    public final float f187482e;

    /* JADX INFO: renamed from: f */
    public final float f187483f;

    /* JADX INFO: renamed from: g */
    public final float f187484g;

    /* JADX INFO: renamed from: h */
    public final float f187485h;

    /* JADX INFO: renamed from: i */
    public final List f187486i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f187487j;

    public qd40(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = c5b1.f34134a;
            list = lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        this.f187478a = str;
        this.f187479b = f;
        this.f187480c = f2;
        this.f187481d = f3;
        this.f187482e = f4;
        this.f187483f = f5;
        this.f187484g = f6;
        this.f187485h = f7;
        this.f187486i = list;
        this.f187487j = arrayList;
    }
}
