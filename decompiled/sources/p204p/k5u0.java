package p204p;

import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class k5u0 {

    /* JADX INFO: renamed from: a */
    public o5u0 f119582a = o5u0.f162097t;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f119583b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f119584c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f119585d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f119586e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public b4w f119587f;

    /* JADX INFO: renamed from: g */
    public b4w f119588g;

    /* JADX INFO: renamed from: a */
    public static void m55564a(k5u0 k5u0Var, up60 up60Var, wwf wwfVar, qir0 qir0Var) {
        k5u0Var.m55565b(wwfVar, up60Var);
        LinkedHashMap linkedHashMap = k5u0Var.f119584c;
        if (linkedHashMap.containsKey(up60Var)) {
            throw new ComponentRecyclerAdapter$DuplicateComponentProducerFound(up60Var);
        }
        linkedHashMap.put(up60Var, qir0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m55565b(wwf wwfVar, up60 up60Var) {
        LinkedHashMap linkedHashMap = this.f119583b;
        if (linkedHashMap.containsKey(up60Var)) {
            throw new ComponentRecyclerAdapter$DuplicateComparatorFound(up60Var);
        }
        linkedHashMap.put(up60Var, wwfVar);
    }
}
