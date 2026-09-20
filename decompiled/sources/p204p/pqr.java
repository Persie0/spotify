package p204p;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class pqr {

    /* JADX INFO: renamed from: a */
    public final String f180396a;

    /* JADX INFO: renamed from: b */
    public final long[] f180397b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f180398c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f180399d;

    /* JADX INFO: renamed from: e */
    public boolean f180400e;

    /* JADX INFO: renamed from: f */
    public boolean f180401f;

    /* JADX INFO: renamed from: g */
    public nqr f180402g;

    /* JADX INFO: renamed from: h */
    public int f180403h;

    /* JADX INFO: renamed from: i */
    public long f180404i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wqr f180405j;

    public pqr(wqr wqrVar, String str) {
        this.f180405j = wqrVar;
        this.f180396a = str;
        wqrVar.getClass();
        this.f180397b = new long[2];
        this.f180398c = new ArrayList();
        this.f180399d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.f180398c.add(this.f180405j.f254146a.m80403e(sb.toString()));
            sb.append(".tmp");
            this.f180399d.add(this.f180405j.f254146a.m80403e(sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final rqr m70688a() {
        TimeZone timeZone = c0f1.f32774a;
        if (!this.f180400e) {
            return null;
        }
        wqr wqrVar = this.f180405j;
        if (!wqrVar.f254144Y && (this.f180402g != null || this.f180401f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            try {
                wt31 wt31VarMo40348n = wqrVar.f254147b.f119035c.mo40348n((tbn0) this.f180398c.get(i));
                if (!wqrVar.f254144Y) {
                    this.f180403h++;
                    wt31VarMo40348n = new oqr(wt31VarMo40348n, wqrVar, this);
                }
                arrayList.add(wt31VarMo40348n);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a0f1.m24341b((wt31) it.next());
                }
                try {
                    wqrVar.m88785p(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new rqr(this.f180405j, this.f180396a, this.f180404i, arrayList);
    }
}
