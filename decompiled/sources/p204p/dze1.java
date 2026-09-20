package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class dze1 {

    /* JADX INFO: renamed from: a */
    public final tbn0 f54643a;

    /* JADX INFO: renamed from: b */
    public final boolean f54644b;

    /* JADX INFO: renamed from: c */
    public final String f54645c;

    /* JADX INFO: renamed from: d */
    public final long f54646d;

    /* JADX INFO: renamed from: e */
    public final long f54647e;

    /* JADX INFO: renamed from: f */
    public final long f54648f;

    /* JADX INFO: renamed from: g */
    public final int f54649g;

    /* JADX INFO: renamed from: h */
    public final long f54650h;

    /* JADX INFO: renamed from: i */
    public final int f54651i;

    /* JADX INFO: renamed from: j */
    public final int f54652j;

    /* JADX INFO: renamed from: k */
    public final Long f54653k;

    /* JADX INFO: renamed from: l */
    public final Long f54654l;

    /* JADX INFO: renamed from: m */
    public final Long f54655m;

    /* JADX INFO: renamed from: n */
    public final Integer f54656n;

    /* JADX INFO: renamed from: o */
    public final Integer f54657o;

    /* JADX INFO: renamed from: p */
    public final Integer f54658p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f54659q;

    public dze1(tbn0 tbn0Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        this.f54643a = tbn0Var;
        this.f54644b = z;
        this.f54645c = str;
        this.f54646d = j;
        this.f54647e = j2;
        this.f54648f = j3;
        this.f54649g = i;
        this.f54650h = j4;
        this.f54651i = i2;
        this.f54652j = i3;
        this.f54653k = l;
        this.f54654l = l2;
        this.f54655m = l3;
        this.f54656n = num;
        this.f54657o = num2;
        this.f54658p = num3;
        this.f54659q = new ArrayList();
    }

    public /* synthetic */ dze1(tbn0 tbn0Var, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(tbn0Var, z, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) != 0 ? -1L : j4, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) != 0 ? -1 : i3, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, null, null, null);
    }
}
