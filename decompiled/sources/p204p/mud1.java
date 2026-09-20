package p204p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class mud1 extends ibk {

    /* JADX INFO: renamed from: a */
    public WidgetState f147314a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f147315b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nud1 f147316c;

    /* JADX INFO: renamed from: d */
    public int f147317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mud1(nud1 nud1Var, ibk ibkVar) {
        super(ibkVar);
        this.f147316c = nud1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f147315b = obj;
        this.f147317d |= Integer.MIN_VALUE;
        return this.f147316c.m65688a(0, null, this);
    }
}
