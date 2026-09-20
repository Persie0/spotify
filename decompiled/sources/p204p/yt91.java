package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class yt91 {

    /* JADX INFO: renamed from: a */
    public String f276047a;

    /* JADX INFO: renamed from: b */
    public String f276048b;

    /* JADX INFO: renamed from: c */
    public Integer f276049c;

    /* JADX INFO: renamed from: d */
    public String f276050d;

    /* JADX INFO: renamed from: e */
    public String f276051e;

    /* JADX INFO: renamed from: f */
    public String f276052f;

    /* JADX INFO: renamed from: g */
    public String f276053g;

    /* JADX INFO: renamed from: h */
    public String f276054h;

    /* JADX INFO: renamed from: i */
    public ArrayList f276055i;

    /* JADX INFO: renamed from: j */
    public boolean f276056j;

    /* JADX INFO: renamed from: k */
    public String f276057k;

    /* JADX INFO: renamed from: l */
    public String f276058l;

    /* JADX INFO: renamed from: a */
    public final zt91 m94607a() {
        ArrayList arrayList = new ArrayList();
        oyp0 oyp0VarM80908q = ti5.m80908q();
        String str = this.f276047a;
        ofg1.m66846o(str, "name");
        oyp0VarM80908q.m68548q(str);
        oyp0VarM80908q.m68547o(this.f276048b);
        oyp0VarM80908q.m68530C(this.f276050d);
        oyp0VarM80908q.m68551t(this.f276049c);
        oyp0VarM80908q.m68554w(this.f276051e);
        arrayList.add(oyp0VarM80908q.m68536c());
        ArrayList arrayList2 = this.f276055i;
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        String str2 = this.f276052f;
        String str3 = this.f276053g;
        String str4 = this.f276054h;
        ofg1.m66846o(str4, "app");
        return new zt91(str2, str3, str4, arrayList, this.f276056j, this.f276057k, this.f276058l);
    }
}
