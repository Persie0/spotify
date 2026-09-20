package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.mrm0;
import p204p.rzb;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Pane {
    private final List<Action> mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List<Row> mRows;

    public Pane(mrm0 mrm0Var) {
        this.mRows = wdg1.m87845s(mrm0Var.f146580a);
        this.mActionList = wdg1.m87845s(mrm0Var.f146581b);
        this.mImage = mrm0Var.f146583d;
        this.mIsLoading = mrm0Var.f146582c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public List<Row> getRows() {
        List<Row> list = this.mRows;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(this.mRows, this.mActionList, Boolean.valueOf(this.mIsLoading), this.mImage);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ rows: ");
        List<Row> list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append("]");
        return sb.toString();
    }

    private Pane() {
        List list = Collections.EMPTY_LIST;
        this.mRows = list;
        this.mActionList = list;
        this.mIsLoading = false;
        this.mImage = null;
    }
}
