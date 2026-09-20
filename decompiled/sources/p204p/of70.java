package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: classes5.dex */
public final class of70 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f164659b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pyu f164660c;

    public /* synthetic */ of70(niz nizVar, pyu pyuVar, int i) {
        this.f164658a = i;
        this.f164659b = nizVar;
        this.f164660c = pyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        mf70 mf70Var;
        Object c6x0Var;
        qf70 qf70Var;
        switch (this.f164658a) {
            case 0:
                if (fbkVar instanceof mf70) {
                    mf70Var = (mf70) fbkVar;
                    int i = mf70Var.f142981b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mf70Var.f142981b = i - Integer.MIN_VALUE;
                    } else {
                        mf70Var = new mf70(this, fbkVar);
                    }
                } else {
                    mf70Var = new mf70(this, fbkVar);
                }
                Object obj2 = mf70Var.f142980a;
                int i2 = mf70Var.f142981b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    pyu pyuVar = this.f164660c;
                    List list = ((mw51) pyuVar.f183520b).f147718c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        String str = ((fv51) obj3).f73685f;
                        try {
                            c6x0Var = Boolean.valueOf(!wj50.m88271j(Locale.forLanguageTag(str).toLanguageTag(), pvg1.m71188t(str)));
                        } catch (Throwable th) {
                            c6x0Var = new c6x0(th);
                        }
                        if (s6x0.m77348a(c6x0Var) == null ? ((Boolean) c6x0Var).booleanValue() : false) {
                            arrayList.add(obj3);
                        }
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(pyu.m71664e(pyuVar, (fv51) it.next()));
                    }
                    mf70Var.f142981b = 1;
                    Object objEmit = this.f164659b.emit(arrayList2, mf70Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof qf70) {
                    qf70Var = (qf70) fbkVar;
                    int i3 = qf70Var.f188134b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qf70Var.f188134b = i3 - Integer.MIN_VALUE;
                    } else {
                        qf70Var = new qf70(this, fbkVar);
                    }
                } else {
                    qf70Var = new qf70(this, fbkVar);
                }
                Object obj4 = qf70Var.f188133a;
                int i4 = qf70Var.f188134b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    Optional optional = (Optional) obj;
                    wj50.m88279p(optional);
                    fv51 fv51Var = (fv51) optional.orElse(null);
                    df70 df70VarM71664e = fv51Var != null ? pyu.m71664e(this.f164660c, fv51Var) : null;
                    qf70Var.f188134b = 1;
                    Object objEmit2 = this.f164659b.emit(df70VarM71664e, qf70Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
