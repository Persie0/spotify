package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ydt0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ owp f271826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f271827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydt0(owp owpVar, int i, int i2) {
        super(0);
        this.f271825a = i2;
        this.f271826b = owpVar;
        this.f271827c = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f271825a) {
            case 0:
                lv31 lv31VarEdit = ((pul) this.f271826b.f170755f).f181497a.edit();
                lv31VarEdit.m60049b(qul.f192739a, this.f271827c);
                lv31VarEdit.m60054g();
                break;
            default:
                pul pulVar = (pul) this.f271826b.f170755f;
                int i = this.f271827c + 1;
                lv31 lv31VarEdit2 = pulVar.f181497a.edit();
                lv31VarEdit2.m60049b(qul.f192739a, i);
                lv31VarEdit2.m60054g();
                break;
        }
        return w2a1.f247311a;
    }
}
