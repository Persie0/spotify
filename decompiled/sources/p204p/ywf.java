package p204p;

import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewBinderFound;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ywf {

    /* JADX INFO: renamed from: a */
    public List f276955a = lau.f131415a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f276956b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f276957c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f276958d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f276959e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public b4w f276960f;

    /* JADX INFO: renamed from: a */
    public final void m94788a(up60 up60Var, wwf wwfVar, qir0 qir0Var, pxf pxfVar) {
        LinkedHashMap linkedHashMap = this.f276956b;
        if (linkedHashMap.containsKey(up60Var)) {
            throw new ComponentRecyclerAdapter$DuplicateComparatorFound(up60Var);
        }
        linkedHashMap.put(up60Var, wwfVar);
        LinkedHashMap linkedHashMap2 = this.f276957c;
        if (linkedHashMap2.containsKey(up60Var)) {
            throw new ComponentRecyclerAdapter$DuplicateComponentProducerFound(up60Var);
        }
        linkedHashMap2.put(up60Var, qir0Var);
        if (pxfVar != null) {
            LinkedHashMap linkedHashMap3 = this.f276958d;
            if (!linkedHashMap3.containsKey(up60Var)) {
                linkedHashMap3.put(up60Var, pxfVar);
                return;
            }
            throw new ComponentRecyclerAdapter$DuplicateComponentViewBinderFound("ComponentViewBinder<AnyModel, AnyEvent> instance for " + up60Var + " has already been supplied.");
        }
    }
}
