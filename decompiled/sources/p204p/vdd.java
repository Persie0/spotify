package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vdd extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f240390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f240391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f240392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f240393d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f240394e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f240395f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f240396g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ luk f240397h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ luk f240398i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar, luk lukVar2) {
        super(1);
        this.f240390a = z;
        this.f240391b = z2;
        this.f240392c = z3;
        this.f240393d = z4;
        this.f240394e = z5;
        this.f240395f = z6;
        this.f240396g = z7;
        this.f240397h = lukVar;
        this.f240398i = lukVar2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        qsp qspVar = (qsp) ((hmh0) obj);
        qspVar.f192162a = new tdd(this.f240390a, this.f240391b, this.f240392c, this.f240393d, this.f240394e, this.f240395f, this.f240396g, 1);
        qspVar.f192165d = new udd(this.f240397h, 0);
        qspVar.f192166e = new udd(this.f240398i, 1);
        return w2a1.f247311a;
    }
}
