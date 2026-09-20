package p204p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b1j0 implements j1j0, BiFunction, Function {

    /* JADX INFO: renamed from: a */
    public final String f22368a;

    /* JADX INFO: renamed from: b */
    public final String f22369b;

    public /* synthetic */ b1j0(String str, String str2) {
        this.f22368a = str;
        this.f22369b = str2;
    }

    @Override // p204p.j1j0
    /* JADX INFO: renamed from: a */
    public String mo24455a() {
        return this.f22369b;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(wj50.m88271j(this.f22368a, (String) obj) && wj50.m88271j(this.f22369b, (String) obj2));
    }

    @Override // p204p.j1j0
    public String getUri() {
        return this.f22368a;
    }

    public b1j0(String str) {
        this.f22368a = str;
        ydj.m93454m("Unknown navigable entity: ", str);
        this.f22369b = "unknown";
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str = this.f22368a;
        wj50.m88279p(str);
        String str2 = this.f22369b;
        wj50.m88279p(str2);
        return new v331(str2, (List) obj, str);
    }
}
