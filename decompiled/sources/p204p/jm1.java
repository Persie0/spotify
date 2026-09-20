package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jm1 extends ibk {

    /* JADX INFO: renamed from: a */
    public List f113723a;

    /* JADX INFO: renamed from: b */
    public List f113724b;

    /* JADX INFO: renamed from: c */
    public x6m f113725c;

    /* JADX INFO: renamed from: d */
    public mm1 f113726d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f113727e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mm1 f113728f;

    /* JADX INFO: renamed from: g */
    public int f113729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm1(mm1 mm1Var, fbk fbkVar) {
        super(fbkVar);
        this.f113728f = mm1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113727e = obj;
        this.f113729g |= Integer.MIN_VALUE;
        return mm1.m62261n(this.f113728f, this);
    }
}
