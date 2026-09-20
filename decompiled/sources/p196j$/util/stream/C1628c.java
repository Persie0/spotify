package p196j$.util.stream;

import java.util.List;
import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: j$.util.stream.c */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1628c implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        list.addAll((List) obj2);
        return list;
    }
}
