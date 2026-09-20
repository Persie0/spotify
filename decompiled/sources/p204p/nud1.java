package p204p;

import android.util.Size;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetViewBound;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes2.dex */
public final class nud1 {

    /* JADX INFO: renamed from: a */
    public final qre0 f158604a;

    /* JADX INFO: renamed from: b */
    public final g7d1 f158605b;

    public nud1(qre0 qre0Var, g7d1 g7d1Var) {
        this.f158604a = qre0Var;
        this.f158605b = g7d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m65688a(int i, WidgetState widgetState, ibk ibkVar) {
        mud1 mud1Var;
        if (ibkVar instanceof mud1) {
            mud1Var = (mud1) ibkVar;
            int i2 = mud1Var.f147317d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mud1Var.f147317d = i2 - Integer.MIN_VALUE;
            } else {
                mud1Var = new mud1(this, ibkVar);
            }
        } else {
            mud1Var = new mud1(this, ibkVar);
        }
        Object objM43809h = mud1Var.f147315b;
        int i3 = mud1Var.f147317d;
        if (i3 == 0) {
            bga.m29073P(objM43809h);
            mud1Var.f147314a = widgetState;
            mud1Var.f147317d = 1;
            objM43809h = this.f158605b.m43809h(i, mud1Var);
            yuk yukVar = yuk.f276404a;
            if (objM43809h == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            widgetState = mud1Var.f147314a;
            bga.m29073P(objM43809h);
        }
        Size size = (Size) objM43809h;
        bhk0 bhk0VarM23128t = NpvRecommendationsWidgetViewBound.m23128t();
        bhk0VarM23128t.m29252r(widgetState.getWidgetCategory());
        bhk0VarM23128t.m29250m(widgetState.getInstrumentationValue());
        bhk0VarM23128t.m29255u(size.getWidth());
        bhk0VarM23128t.m29253s(size.getHeight());
        bhk0VarM23128t.m29254t();
        bhk0VarM23128t.m29251q(widgetState instanceof WidgetState.ActiveSession ? ((WidgetState.ActiveSession) widgetState).getContentType().getValue() : "");
        this.f158604a.m73616a(bhk0VarM23128t.build());
        return w2a1.f247311a;
    }
}
