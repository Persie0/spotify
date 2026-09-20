package androidx.car.app.model;

import android.annotation.SuppressLint;
import java.util.Objects;
import p204p.q7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
@SuppressLint({"ListenerInterface"})
public final class ParkedOnlyOnClickListener implements q7l0 {
    private final q7l0 mListener;

    private ParkedOnlyOnClickListener(q7l0 q7l0Var) {
        this.mListener = q7l0Var;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static ParkedOnlyOnClickListener create(q7l0 q7l0Var) {
        Objects.requireNonNull(q7l0Var);
        return new ParkedOnlyOnClickListener(q7l0Var);
    }

    @Override // p204p.q7l0
    public void onClick() {
        this.mListener.onClick();
    }
}
