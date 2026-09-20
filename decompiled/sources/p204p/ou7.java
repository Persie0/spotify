package p204p;

import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class ou7 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mu7 f170183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou7(mu7 mu7Var, int i) {
        super(0);
        this.f170182a = i;
        this.f170183b = mu7Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i;
        switch (this.f170182a) {
            case 0:
                return Boolean.valueOf(bk5.m29624m1(new lu7[]{lu7.f137018a, lu7.f137021d}).contains(this.f170183b.f147263a));
            default:
                int iOrdinal = this.f170183b.f147263a.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.auto_generated;
                } else if (iOrdinal == 1) {
                    i = R.string.creator_provided;
                } else if (iOrdinal == 2) {
                    i = R.string.creator_provided_static;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.auto_generated_static;
                }
                return Integer.valueOf(i);
        }
    }
}
