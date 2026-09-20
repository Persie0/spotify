package p204p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class dna implements Function {

    /* JADX INFO: renamed from: a */
    public static final dna f50714a = new dna();

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        BrowseState.Content content = (BrowseState.Content) obj;
        return new pqm0(content.getModel().getDisplayableSections(), Integer.valueOf(content.getColumnCount()));
    }
}
