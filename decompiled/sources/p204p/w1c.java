package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w1c implements igo {

    /* JADX INFO: renamed from: a */
    public final o6k f247055a;

    /* JADX INFO: renamed from: b */
    public final o6k f247056b;

    /* JADX INFO: renamed from: c */
    public final o6k f247057c;

    /* JADX INFO: renamed from: d */
    public final o6k f247058d;

    /* JADX INFO: renamed from: e */
    public final o6k f247059e;

    /* JADX INFO: renamed from: f */
    public final o6k f247060f;

    /* JADX INFO: renamed from: g */
    public final o6k f247061g;

    /* JADX INFO: renamed from: h */
    public final o6k f247062h;

    /* JADX INFO: renamed from: i */
    public final o6k f247063i;

    /* JADX INFO: renamed from: j */
    public final o6k f247064j;

    /* JADX INFO: renamed from: k */
    public final o6k f247065k;

    /* JADX INFO: renamed from: l */
    public final o6k f247066l;

    /* JADX INFO: renamed from: m */
    public final o6k f247067m;

    /* JADX INFO: renamed from: n */
    public final o6k f247068n;

    /* JADX INFO: renamed from: o */
    public final o6k f247069o;

    /* JADX INFO: renamed from: p */
    public final o6k f247070p;

    /* JADX INFO: renamed from: q */
    public final o6k f247071q;

    /* JADX INFO: renamed from: r */
    public final o6k f247072r;

    /* JADX INFO: renamed from: s */
    public final o6k f247073s;

    public w1c(o6k o6kVar, o6k o6kVar2, o6k o6kVar3, o6k o6kVar4, o6k o6kVar5, o6k o6kVar6, o6k o6kVar7, o6k o6kVar8, o6k o6kVar9, o6k o6kVar10, o6k o6kVar11, o6k o6kVar12, o6k o6kVar13, o6k o6kVar14, o6k o6kVar15, o6k o6kVar16, o6k o6kVar17, o6k o6kVar18, o6k o6kVar19, int i) {
        o6k o6kVar20 = (i & 2048) != 0 ? new o6k(null) : o6kVar12;
        o6k o6kVar21 = (i & 4096) != 0 ? new o6k(null) : o6kVar13;
        o6k o6kVar22 = (i & 8192) != 0 ? new o6k(null) : o6kVar14;
        o6k o6kVar23 = (i & 16384) != 0 ? new o6k(null) : o6kVar15;
        o6k o6kVar24 = (32768 & i) != 0 ? new o6k(null) : o6kVar16;
        o6k o6kVar25 = (65536 & i) != 0 ? new o6k(null) : o6kVar17;
        o6k o6kVar26 = (131072 & i) != 0 ? new o6k(null) : o6kVar18;
        o6k o6kVar27 = (i & 262144) != 0 ? new o6k(null) : o6kVar19;
        this.f247055a = o6kVar;
        this.f247056b = o6kVar2;
        this.f247057c = o6kVar3;
        this.f247058d = o6kVar4;
        this.f247059e = o6kVar5;
        this.f247060f = o6kVar6;
        this.f247061g = o6kVar7;
        this.f247062h = o6kVar8;
        this.f247063i = o6kVar9;
        this.f247064j = o6kVar10;
        this.f247065k = o6kVar11;
        this.f247066l = o6kVar20;
        this.f247067m = o6kVar21;
        this.f247068n = o6kVar22;
        this.f247069o = o6kVar23;
        this.f247070p = o6kVar24;
        this.f247071q = o6kVar25;
        this.f247072r = o6kVar26;
        this.f247073s = o6kVar27;
    }

    @Override // p204p.igo
    public final boolean match(Object obj) {
        x1c x1cVar = (x1c) obj;
        if (!this.f247055a.m66350a(x1cVar.f257142a) || !this.f247056b.m66350a(x1cVar.f257143b)) {
            return false;
        }
        if (!this.f247057c.m66350a(Boolean.valueOf(x1cVar.f257144c)) || !this.f247058d.m66350a(x1cVar.f257145d) || !this.f247059e.m66350a(x1cVar.f257146e)) {
            return false;
        }
        if (!this.f247060f.m66350a(Boolean.valueOf(x1cVar.f257147f)) || !this.f247061g.m66350a(x1cVar.f257148g) || !this.f247062h.m66350a(x1cVar.f257149h)) {
            return false;
        }
        if (!this.f247063i.m66350a(Boolean.valueOf(x1cVar.f257150i)) || !this.f247064j.m66350a(x1cVar.f257151j)) {
            return false;
        }
        if (!this.f247065k.m66350a(Boolean.valueOf(x1cVar.f257152k))) {
            return false;
        }
        if (!this.f247066l.m66350a(Boolean.valueOf(x1cVar.f257153l))) {
            return false;
        }
        if (!this.f247067m.m66350a(Boolean.valueOf(x1cVar.f257154m))) {
            return false;
        }
        if (!this.f247068n.m66350a(Boolean.valueOf(x1cVar.f257155n))) {
            return false;
        }
        if (!this.f247069o.m66350a(Boolean.valueOf(x1cVar.f257156o))) {
            return false;
        }
        if (!this.f247070p.m66350a(Boolean.valueOf(x1cVar.f257157p))) {
            return false;
        }
        if (!this.f247071q.m66350a(Boolean.valueOf(x1cVar.f257158q))) {
            return false;
        }
        if (this.f247072r.m66350a(Boolean.valueOf(x1cVar.f257159r))) {
            return this.f247073s.m66350a(Boolean.valueOf(x1cVar.f257160s));
        }
        return false;
    }
}
