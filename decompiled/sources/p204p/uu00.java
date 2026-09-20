package p204p;

import com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto.GatedEntityRelations;
import com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto.ValueProp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uu00 implements aqx {
    @Override // p204p.aqx
    /* JADX INFO: renamed from: a */
    public final ktx mo26903a(byte[] bArr) {
        ae50<GatedEntityRelations.Entity> ae50VarM10134n = GatedEntityRelations.m10133o(bArr).m10134n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM10134n, 10));
        for (GatedEntityRelations.Entity entity : ae50VarM10134n) {
            String uri = entity.getUri();
            ae50 ae50VarM10137p = entity.m10137p();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM10137p, 10));
            Iterator<E> it = ae50VarM10137p.iterator();
            while (it.hasNext()) {
                arrayList2.add(new v3b1(((ValueProp) it.next()).m10138n()));
            }
            arrayList.add(new su00(uri, arrayList2, new w3b1(entity.m10136o().m10141p(), entity.m10136o().m10140o()), new yay(entity.m10135n().getUri(), entity.m10135n().getDescription())));
        }
        return new tu00(arrayList);
    }

    @Override // p204p.aqx
    /* JADX INFO: renamed from: b */
    public final int mo26904b() {
        return 164;
    }

    @Override // p204p.aqx
    public final Class type() {
        return tu00.class;
    }
}
