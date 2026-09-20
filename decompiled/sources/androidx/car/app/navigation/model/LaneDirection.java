package androidx.car.app.navigation.model;

import java.util.Objects;
import p204p.edb;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class LaneDirection {
    public static final int SHAPE_NORMAL_LEFT = 5;
    public static final int SHAPE_NORMAL_RIGHT = 6;
    public static final int SHAPE_SHARP_LEFT = 7;
    public static final int SHAPE_SHARP_RIGHT = 8;
    public static final int SHAPE_SLIGHT_LEFT = 3;
    public static final int SHAPE_SLIGHT_RIGHT = 4;
    public static final int SHAPE_STRAIGHT = 2;
    public static final int SHAPE_UNKNOWN = 1;
    public static final int SHAPE_U_TURN_LEFT = 9;
    public static final int SHAPE_U_TURN_RIGHT = 10;
    private final boolean mIsRecommended;
    private final int mShape;

    private LaneDirection(int i, boolean z) {
        this.mShape = i;
        this.mIsRecommended = z;
    }

    public static LaneDirection create(int i, boolean z) {
        return new LaneDirection(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mShape), Boolean.valueOf(this.mIsRecommended));
    }

    public boolean isRecommended() {
        return this.mIsRecommended;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[shape: ");
        sb.append(this.mShape);
        sb.append(", isRecommended: ");
        return edb.m38570s(sb, this.mIsRecommended, "]");
    }

    private LaneDirection() {
        this.mShape = 1;
        this.mIsRecommended = false;
    }
}
