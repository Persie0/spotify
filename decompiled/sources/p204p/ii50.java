package p204p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ii50 implements lbb {

    /* JADX INFO: renamed from: a */
    public final Method f102449a;

    /* JADX INFO: renamed from: b */
    public final List f102450b;

    /* JADX INFO: renamed from: c */
    public final Class f102451c;

    public ii50(Method method, List list) {
        this.f102449a = method;
        this.f102450b = list;
        this.f102451c = method.getReturnType();
    }

    /* JADX INFO: renamed from: a */
    public final void m50693a(Object[] objArr) {
        if (wj50.m88248C(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(wj50.m88248C(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(klh.m56832d(objArr.length, " were provided.", sb));
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: i */
    public final Type mo32241i() {
        return this.f102451c;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: k */
    public final List mo32242k() {
        return this.f102450b;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Member mo32243l() {
        return null;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: m */
    public final /* bridge */ boolean mo32244m() {
        return false;
    }
}
