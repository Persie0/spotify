package p204p;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ccb implements lbb {

    /* JADX INFO: renamed from: a */
    public final Member f36366a;

    /* JADX INFO: renamed from: b */
    public final Type f36367b;

    /* JADX INFO: renamed from: c */
    public final Class f36368c;

    /* JADX INFO: renamed from: d */
    public final List f36369d;

    public ccb(Member member, Type type, Class cls, Type[] typeArr) {
        List listM29620k1;
        this.f36366a = member;
        this.f36367b = type;
        this.f36368c = cls;
        if (cls != null) {
            mbq mbqVar = new mbq(2);
            mbqVar.m61421b(cls);
            mbqVar.m61422c(typeArr);
            ArrayList arrayList = mbqVar.f141956a;
            listM29620k1 = h6f.m46715L(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM29620k1 = bk5.m29620k1(typeArr);
        }
        this.f36369d = listM29620k1;
    }

    /* JADX INFO: renamed from: a */
    public void mo32239a(Object[] objArr) {
        if (wj50.m88248C(this) == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(wj50.m88248C(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(klh.m56832d(objArr.length, " were provided.", sb));
    }

    /* JADX INFO: renamed from: b */
    public final void m32240b(Object obj) {
        if (obj == null || !this.f36366a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: i */
    public final Type mo32241i() {
        return this.f36367b;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: k */
    public final List mo32242k() {
        return this.f36369d;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: l */
    public final Member mo32243l() {
        return this.f36366a;
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: m */
    public final /* bridge */ boolean mo32244m() {
        return false;
    }
}
