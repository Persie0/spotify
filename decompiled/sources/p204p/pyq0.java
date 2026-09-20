package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class pyq0 implements Function {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f183457a;

    public pyq0(LinkedHashMap linkedHashMap) {
        this.f183457a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public void m71649a(xdf0 xdf0Var) {
        int i = xdf0Var.f260476a;
        int i2 = xdf0Var.f260477b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f183457a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Objects.toString(treeMap2.get(Integer.valueOf(i2)));
            xdf0Var.toString();
        }
        treeMap2.put(Integer.valueOf(i2), xdf0Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return kkc0.m56700m0(this.f183457a, (Map) obj);
    }

    /* JADX INFO: renamed from: b */
    public void m71650b(xdf0... xdf0VarArr) {
        for (xdf0 xdf0Var : xdf0VarArr) {
            m71649a(xdf0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public List m71651c(int i, int i2) {
        return gue.m45747i(this, i, i2);
    }

    public pyq0() {
        this.f183457a = new LinkedHashMap();
    }
}
