package androidx.car.app.model;

import java.util.Objects;
import p204p.dq60;
import p204p.qrx0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class RowSection extends Section<Row> {
    private final int mInitialSelectedIndex;

    public /* synthetic */ RowSection(qrx0 qrx0Var, int i) {
        this(qrx0Var);
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowSection)) {
            return false;
        }
        RowSection rowSection = (RowSection) obj;
        return super.equals(rowSection) && this.mInitialSelectedIndex == rowSection.mInitialSelectedIndex;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mInitialSelectedIndex));
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("RowSection { initialSelectedIndex: ");
        sb.append(this.mInitialSelectedIndex);
        sb.append(", ");
        return dq60.m36616p(super.toString(), " }", sb);
    }

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    private RowSection(qrx0 qrx0Var) {
        super(qrx0Var);
        this.mInitialSelectedIndex = qrx0Var.f191923f;
    }
}
