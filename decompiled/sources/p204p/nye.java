package p204p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes10.dex */
public final class nye extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f159795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f159796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f159797c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f159798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nye(Object obj, Object obj2, long j, int i) {
        super(0);
        this.f159795a = i;
        this.f159796b = obj;
        this.f159798d = obj2;
        this.f159797c = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f159795a) {
            case 0:
                gh00 gh00Var = (gh00) this.f159796b;
                gye gyeVar = (gye) this.f159798d;
                gh00Var.invoke(new dye(gyeVar.f85561b, gyeVar.f85560a, this.f159797c));
                return w2a1.f247311a;
            case 1:
                gh00 gh00Var2 = (gh00) this.f159796b;
                kkk kkkVar = (kkk) this.f159798d;
                gh00Var2.invoke(new hkk(kkkVar.f123613a, kkkVar.f123614b, this.f159797c));
                return w2a1.f247311a;
            case 2:
                ((th00) this.f159796b).invoke(((klk) this.f159798d).f123909a, new n6f(this.f159797c));
                return w2a1.f247311a;
            case 3:
                return Long.valueOf(((mv31) this.f159796b).m62893n().getLong(((fv31) this.f159798d).f73630a, this.f159797c));
            default:
                return Long.valueOf(((SharedPreferences) this.f159796b).getLong((String) this.f159798d, this.f159797c));
        }
    }
}
