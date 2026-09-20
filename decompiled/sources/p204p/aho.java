package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aho implements Function {

    /* JADX INFO: renamed from: a */
    public final List f15725a;

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? this.f15725a : list;
    }
}
