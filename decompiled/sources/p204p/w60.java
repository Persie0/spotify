package p204p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w60 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f248219a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final HashSet f248220b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final void m87265a(Action action) {
        Objects.requireNonNull(action);
        int type = action.getType();
        HashSet hashSet = this.f248220b;
        if (type != 1 && hashSet.contains(Integer.valueOf(type))) {
            throw new IllegalArgumentException("Duplicated action types are disallowed: " + action);
        }
        CarText title = action.getTitle();
        if (title != null) {
            uzb.f235454b.m84293b(title);
        }
        hashSet.add(Integer.valueOf(type));
        this.f248219a.add(action);
    }
}
