package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: classes2.dex */
public final class lex implements Producer {

    /* JADX INFO: renamed from: a */
    public static final lex f132762a = new lex();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.f5771a;
        return new ImmediateWorkRunner();
    }
}
