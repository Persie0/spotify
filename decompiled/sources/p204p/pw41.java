package p204p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pw41 implements Map.Entry, sq60 {

    /* JADX INFO: renamed from: a */
    public final Object f181902a;

    /* JADX INFO: renamed from: b */
    public Object f181903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qw41 f181904c;

    public pw41(qw41 qw41Var) {
        this.f181904c = qw41Var;
        Map.Entry entry = (Map.Entry) qw41Var.f66524e;
        wj50.m88279p(entry);
        this.f181902a = entry.getKey();
        Map.Entry entry2 = (Map.Entry) qw41Var.f66524e;
        wj50.m88279p(entry2);
        this.f181903b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f181902a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f181903b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        qw41 qw41Var = this.f181904c;
        ib31 ib31Var = (ib31) qw41Var.f66522c;
        if (ib31Var.m50117b().m46980e() != qw41Var.f66521b) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f181903b;
        ib31Var.put(this.f181902a, obj);
        this.f181903b = obj;
        return obj2;
    }
}
