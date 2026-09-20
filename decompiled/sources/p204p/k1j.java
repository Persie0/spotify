package p204p;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class k1j implements UnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean f118359a;

    public k1j(Boolean bool) {
        this.f118359a = bool;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        n1j n1jVar = (n1j) obj;
        wj50.m88279p(n1jVar);
        Boolean bool = this.f118359a;
        wj50.m88279p(bool);
        return new n1j(bool.booleanValue(), n1jVar.f149457b);
    }
}
