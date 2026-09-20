package p204p;

import com.spotify.messages.ForegroundServiceStartTwoStepSolutionResult;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public final class mwz0 {

    /* JADX INFO: renamed from: a */
    public final Random f147904a;

    /* JADX INFO: renamed from: b */
    public final qre0 f147905b;

    public mwz0(Random random, qre0 qre0Var) {
        this.f147904a = random;
        this.f147905b = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m63073a(int i, String str) {
        String str2;
        Random random = this.f147904a;
        if ((i != 1 || random.nextDouble() < 0.9999d) && (i == 1 || random.nextDouble() < 0.99d)) {
            return;
        }
        f300 f300VarM13900p = ForegroundServiceStartTwoStepSolutionResult.m13900p();
        f300VarM13900p.m40629m(str);
        if (i == 1) {
            str2 = SearchEndpointResponseKt.RESULT_SUCCESS;
        } else if (i == 2) {
            str2 = "SUCCESS_AFTER_CONNECTING_TO_MBS";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "FAILURE";
        }
        f300VarM13900p.m40630q(str2);
        this.f147905b.m73616a(f300VarM13900p.build());
    }
}
