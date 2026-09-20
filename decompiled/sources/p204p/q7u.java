package p204p;

import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class q7u implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gb80 f186169a;

    public q7u(EmojiCompatInitializer emojiCompatInitializer, gb80 gb80Var) {
        this.f186169a = gb80Var;
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        c95.m31819K().postDelayed(new snk0(1), 500L);
        this.f186169a.mo31988d(this);
    }
}
