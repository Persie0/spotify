package p204p;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class hb81 {

    /* JADX INFO: renamed from: a */
    public final int f89439a;

    /* JADX INFO: renamed from: b */
    public final r300 f89440b;

    /* JADX INFO: renamed from: i */
    public boolean f89447i;

    /* JADX INFO: renamed from: j */
    public byte[] f89448j;

    /* JADX INFO: renamed from: l */
    public final boolean f89450l;

    /* JADX INFO: renamed from: c */
    public final ArrayList f89441c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f89442d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f89443e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f89444f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f89445g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public final HashMap f89446h = new HashMap();

    /* JADX INFO: renamed from: k */
    public long f89449k = -9223372036854775807L;

    public hb81(int i, r300 r300Var, boolean z) {
        this.f89439a = i;
        this.f89440b = r300Var;
        this.f89450l = z;
    }

    /* JADX INFO: renamed from: a */
    public final int m47018a() {
        r300 r300Var = this.f89440b;
        if (!def0.m35794k(r300Var.f195387p)) {
            return 90000;
        }
        int i = r300Var.f195362L;
        if (i != -1) {
            return i;
        }
        return 48000;
    }
}
