package androidx.p004xr.runtime.math;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.fit0;
import p204p.m4b1;
import p204p.uaq0;
import p204p.wj50;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 92\u00020\u0001:\u0001:B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0012\u0010.\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0012\u00100\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b/\u0010'R\u0012\u00102\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b1\u0010'R\u0012\u00104\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b3\u0010'R\u0012\u00106\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b5\u0010'R\u0012\u00108\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b7\u0010'¨\u0006;"}, m24212d2 = {"Landroidx/xr/runtime/math/Pose;", "", "Landroidx/xr/runtime/math/Vector3;", "translation", "Landroidx/xr/runtime/math/Quaternion;", "rotation", "<init>", "(Landroidx/xr/runtime/math/Vector3;Landroidx/xr/runtime/math/Quaternion;)V", "other", "(Landroidx/xr/runtime/math/Pose;)V", "compose", "(Landroidx/xr/runtime/math/Pose;)Landroidx/xr/runtime/math/Pose;", "translate", "(Landroidx/xr/runtime/math/Vector3;)Landroidx/xr/runtime/math/Pose;", "rotate", "(Landroidx/xr/runtime/math/Quaternion;)Landroidx/xr/runtime/math/Pose;", "point", "transformPoint", "(Landroidx/xr/runtime/math/Vector3;)Landroidx/xr/runtime/math/Vector3;", "vector", "transformVector", "getForwardVectorToUpRotation", "(Landroidx/xr/runtime/math/Pose;)Landroidx/xr/runtime/math/Quaternion;", "getUpVectorToUpRotation", "copy", "(Landroidx/xr/runtime/math/Vector3;Landroidx/xr/runtime/math/Quaternion;)Landroidx/xr/runtime/math/Pose;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "invert", "()Landroidx/xr/runtime/math/Pose;", "Landroidx/xr/runtime/math/Vector3;", "getTranslation", "()Landroidx/xr/runtime/math/Vector3;", "Landroidx/xr/runtime/math/Quaternion;", "getRotation", "()Landroidx/xr/runtime/math/Quaternion;", "getInverse", "inverse", "getUp", ContextTrack.TRACK_THUMB_STATE_UP, "getDown", ContextTrack.TRACK_THUMB_STATE_DOWN, "getLeft", "left", "getRight", "right", "getForward", "forward", "getBackward", "backward", "Companion", "p/uaq0", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class Pose {
    private static final float EPSILON = 1.0E-6f;
    private final Quaternion rotation;
    private final Vector3 translation;
    public static final uaq0 Companion = new uaq0();
    public static final Pose Identity = new Pose(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public Pose() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Pose copy$default(Pose pose, Vector3 vector3, Quaternion quaternion, int i, Object obj) {
        if ((i & 1) != 0) {
            vector3 = pose.translation;
        }
        if ((i & 2) != 0) {
            quaternion = pose.rotation;
        }
        return pose.copy(vector3, quaternion);
    }

    public static final float distance(Pose pose, Pose pose2) {
        Companion.getClass();
        m4b1 m4b1Var = Vector3.Companion;
        Vector3 translation = pose.getTranslation();
        Vector3 translation2 = pose2.getTranslation();
        m4b1Var.getClass();
        return m4b1.m60807a(translation, translation2);
    }

    public static final Pose fromLookAt(Vector3 vector3, Vector3 vector4) {
        Companion.getClass();
        Vector3 vector5 = Vector3.f1455Up;
        Vector3 normalized = vector4.minus(vector3).toNormalized();
        fit0 fit0Var = Quaternion.Companion;
        Vector3 vector3UnaryMinus = normalized.unaryMinus();
        fit0Var.getClass();
        return new Pose(vector3, fit0.m41773c(vector3UnaryMinus, vector5));
    }

    private final Pose invert() {
        Quaternion quaternion = this.rotation;
        Quaternion quaternion2 = new Quaternion(-quaternion.getX(), -quaternion.getY(), -quaternion.getZ(), quaternion.getW());
        Vector3 vector3 = this.translation;
        float x = quaternion2.getX();
        float y = quaternion2.getY();
        float z = quaternion2.getZ();
        float w = quaternion2.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = 2;
        return new Pose(new Vector3((f4 * f6) + x2, (f5 * f6) + y2, (f6 * ((x * f2) - (y * f))) + z2).unaryMinus(), quaternion2);
    }

    public static final Pose lerp(Pose pose, Pose pose2, float f) {
        Quaternion quaternionM41774d;
        Companion.getClass();
        m4b1 m4b1Var = Vector3.Companion;
        Vector3 translation = pose.getTranslation();
        Vector3 translation2 = pose2.getTranslation();
        m4b1Var.getClass();
        Vector3 vector3M60808b = m4b1.m60808b(translation, translation2, f);
        Quaternion rotation = pose.getRotation();
        Quaternion rotation2 = pose2.getRotation();
        if ((rotation2.getW() * rotation.getW()) + (rotation2.getZ() * rotation.getZ()) + (rotation2.getY() * rotation.getY()) + (rotation2.getX() * rotation.getX()) < 0.9995f) {
            fit0 fit0Var = Quaternion.Companion;
            Quaternion rotation3 = pose.getRotation();
            Quaternion rotation4 = pose2.getRotation();
            fit0Var.getClass();
            quaternionM41774d = fit0.m41775e(rotation3, rotation4, f);
        } else {
            fit0 fit0Var2 = Quaternion.Companion;
            Quaternion rotation5 = pose.getRotation();
            Quaternion rotation6 = pose2.getRotation();
            fit0Var2.getClass();
            quaternionM41774d = fit0.m41774d(rotation5, rotation6, f);
        }
        return new Pose(vector3M60808b, quaternionM41774d);
    }

    public final Pose compose(Pose other) {
        Quaternion quaternion = this.rotation;
        Vector3 vector3 = other.translation;
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        Vector3 vector3Plus = new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2).plus(this.translation);
        Quaternion quaternion2 = this.rotation;
        Quaternion quaternion3 = other.rotation;
        float x3 = quaternion2.getX();
        float y3 = quaternion2.getY();
        float z3 = quaternion2.getZ();
        float w2 = quaternion2.getW();
        float x4 = quaternion3.getX();
        float y4 = quaternion3.getY();
        float z4 = quaternion3.getZ();
        float w3 = quaternion3.getW();
        return new Pose(vector3Plus, new Quaternion(((y3 * z4) + ((x3 * w3) + (w2 * x4))) - (z3 * y4), (z3 * x4) + (y3 * w3) + ((w2 * y4) - (x3 * z4)), (z3 * w3) + (((x3 * y4) + (w2 * z4)) - (y3 * x4)), (((w2 * w3) - (x3 * x4)) - (y3 * y4)) - (z3 * z4)));
    }

    public final Pose copy() {
        return copy$default(this, null, null, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pose)) {
            return false;
        }
        Pose pose = (Pose) other;
        return wj50.m88271j(this.translation, pose.translation) && wj50.m88271j(this.rotation, pose.rotation);
    }

    public final Vector3 getBackward() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.Backward;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Vector3 getDown() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.Down;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Vector3 getForward() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.Forward;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Quaternion getForwardVectorToUpRotation(Pose other) {
        Quaternion rotation = other.getRotation();
        Vector3 vector3 = Vector3.f1455Up;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        Vector3 normalized = new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f6 * f7) + z2).toNormalized();
        Quaternion rotation2 = getRotation();
        Vector3 vector4 = Vector3.Right;
        float x3 = rotation2.getX();
        float y3 = rotation2.getY();
        float z3 = rotation2.getZ();
        float w2 = rotation2.getW();
        float x4 = vector4.getX();
        float y4 = vector4.getY();
        float z4 = vector4.getZ();
        float f8 = (w2 * x4) + ((y3 * z4) - (z3 * y4));
        float f9 = (w2 * y4) + ((z3 * x4) - (x3 * z4));
        float f10 = (w2 * z4) + ((x3 * y4) - (y3 * x4));
        Vector3 vector3Cross = normalized.cross(new Vector3((((y3 * f10) - (z3 * f9)) * f7) + x4, (((z3 * f8) - (f10 * x3)) * f7) + y4, (((x3 * f9) - (y3 * f8)) * f7) + z4).toNormalized());
        if ((vector3Cross.getZ() * vector3Cross.getZ()) + (vector3Cross.getY() * vector3Cross.getY()) + (vector3Cross.getX() * vector3Cross.getX()) < EPSILON) {
            Quaternion rotation3 = getRotation();
            float x5 = rotation3.getX();
            float y5 = rotation3.getY();
            float z5 = rotation3.getZ();
            float w3 = rotation3.getW();
            float x6 = vector3.getX();
            float y6 = vector3.getY();
            float z6 = vector3.getZ();
            float f11 = (w3 * x6) + ((y5 * z6) - (z5 * y6));
            float f12 = (w3 * y6) + ((z5 * x6) - (x5 * z6));
            float f13 = (w3 * z6) + ((x5 * y6) - (y5 * x6));
            vector3Cross = new Vector3((((y5 * f13) - (z5 * f12)) * f7) + x6, (((z5 * f11) - (f13 * x5)) * f7) + y6, (f7 * ((x5 * f12) - (y5 * f11))) + z6);
        }
        Quaternion.Companion.getClass();
        return fit0.m41773c(normalized, vector3Cross);
    }

    public final Pose getInverse() {
        return invert();
    }

    public final Vector3 getLeft() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.Left;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Vector3 getRight() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.Right;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Quaternion getRotation() {
        return this.rotation;
    }

    public final Vector3 getTranslation() {
        return this.translation;
    }

    public final Vector3 getUp() {
        Quaternion rotation = getRotation();
        Vector3 vector3 = Vector3.f1455Up;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Quaternion getUpVectorToUpRotation(Pose other) {
        Pose poseRotate;
        Quaternion rotation = other.getRotation();
        Vector3 vector3 = Vector3.f1455Up;
        float x = rotation.getX();
        float y = rotation.getY();
        float z = rotation.getZ();
        float w = rotation.getW();
        float x2 = vector3.getX();
        float y2 = vector3.getY();
        float z2 = vector3.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        Vector3 normalized = new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f6 * f7) + z2).toNormalized();
        Quaternion rotation2 = getRotation();
        float x3 = rotation2.getX();
        float y3 = rotation2.getY();
        float z3 = rotation2.getZ();
        float w2 = rotation2.getW();
        float x4 = vector3.getX();
        float y4 = vector3.getY();
        float z4 = vector3.getZ();
        float f8 = (w2 * x4) + ((y3 * z4) - (z3 * y4));
        float f9 = (w2 * y4) + ((z3 * x4) - (x3 * z4));
        float f10 = (w2 * z4) + ((x3 * y4) - (y3 * x4));
        Vector3 normalized2 = new Vector3((((y3 * f10) - (z3 * f9)) * f7) + x4, (((z3 * f8) - (f10 * x3)) * f7) + y4, (((x3 * f9) - (y3 * f8)) * f7) + z4).toNormalized();
        Quaternion rotation3 = other.getRotation();
        Vector3 vector4 = Vector3.Right;
        float x5 = rotation3.getX();
        float y5 = rotation3.getY();
        float z5 = rotation3.getZ();
        float w3 = rotation3.getW();
        float x6 = vector4.getX();
        float y6 = vector4.getY();
        float z6 = vector4.getZ();
        float f11 = (w3 * x6) + ((y5 * z6) - (z5 * y6));
        float f12 = (w3 * y6) + ((z5 * x6) - (x5 * z6));
        float f13 = (w3 * z6) + ((x5 * y6) - (y5 * x6));
        Vector3 normalized3 = new Vector3((((y5 * f13) - (z5 * f12)) * f7) + x6, (((z5 * f11) - (f13 * x5)) * f7) + y6, (((x5 * f12) - (y5 * f11)) * f7) + z6).toNormalized();
        if (Math.abs(normalized.dot(normalized2)) < EPSILON) {
            Vector3 vector3Cross = normalized2.cross(normalized);
            float degrees = (float) Math.toDegrees(Math.asin((float) Math.sqrt((vector3Cross.getZ() * vector3Cross.getZ()) + (vector3Cross.getY() * vector3Cross.getY()) + (vector3Cross.getX() * vector3Cross.getX()))));
            Quaternion.Companion.getClass();
            poseRotate = rotate(fit0.m41772b(normalized3, degrees));
        } else {
            poseRotate = this;
        }
        Quaternion rotation4 = poseRotate.getRotation();
        float x7 = rotation4.getX();
        float y7 = rotation4.getY();
        float z7 = rotation4.getZ();
        float w4 = rotation4.getW();
        float x8 = vector4.getX();
        float y8 = vector4.getY();
        float z8 = vector4.getZ();
        float f14 = (w4 * x8) + ((y7 * z8) - (z7 * y8));
        float f15 = (w4 * y8) + ((z7 * x8) - (x7 * z8));
        float f16 = (w4 * z8) + ((x7 * y8) - (y7 * x8));
        Vector3 vector3Cross2 = new Vector3((((y7 * f16) - (z7 * f15)) * f7) + x8, (((z7 * f14) - (f16 * x7)) * f7) + y8, (((x7 * f15) - (y7 * f14)) * f7) + z8).toNormalized().cross(normalized);
        if ((vector3Cross2.getZ() * vector3Cross2.getZ()) + (vector3Cross2.getY() * vector3Cross2.getY()) + (vector3Cross2.getX() * vector3Cross2.getX()) < EPSILON) {
            Quaternion rotation5 = poseRotate.getRotation();
            Vector3 vector5 = Vector3.Forward;
            float x9 = rotation5.getX();
            float y9 = rotation5.getY();
            float z9 = rotation5.getZ();
            float w5 = rotation5.getW();
            float x10 = vector5.getX();
            float y10 = vector5.getY();
            float z10 = vector5.getZ();
            float f17 = (w5 * x10) + ((y9 * z10) - (z9 * y10));
            float f18 = (w5 * y10) + ((z9 * x10) - (x9 * z10));
            float f19 = (w5 * z10) + ((x9 * y10) - (y9 * x10));
            vector3Cross2 = new Vector3((((y9 * f19) - (z9 * f18)) * f7) + x10, (((z9 * f17) - (f19 * x9)) * f7) + y10, (f7 * ((x9 * f18) - (y9 * f17))) + z10);
        }
        Quaternion.Companion.getClass();
        return fit0.m41773c(vector3Cross2, normalized);
    }

    public int hashCode() {
        return this.rotation.hashCode() + (this.translation.hashCode() * 31);
    }

    public final Pose rotate(Quaternion rotation) {
        Vector3 vector3 = this.translation;
        Quaternion quaternion = this.rotation;
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = rotation.getX();
        float y2 = rotation.getY();
        float z2 = rotation.getZ();
        float w2 = rotation.getW();
        return new Pose(vector3, new Quaternion(((y * z2) + ((x * w2) + (w * x2))) - (z * y2), (z * x2) + (y * w2) + ((w * y2) - (x * z2)), (z * w2) + (((x * y2) + (w * z2)) - (y * x2)), (((w * w2) - (x * x2)) - (y * y2)) - (z * z2)));
    }

    public String toString() {
        return "Pose{\n\tTranslation=" + this.translation + "\n\tRotation=" + this.rotation + "\n}";
    }

    public final Vector3 transformPoint(Vector3 point) {
        Quaternion quaternion = this.rotation;
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = point.getX();
        float y2 = point.getY();
        float z2 = point.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2).plus(this.translation);
    }

    public final Vector3 transformVector(Vector3 vector) {
        Quaternion quaternion = this.rotation;
        float x = quaternion.getX();
        float y = quaternion.getY();
        float z = quaternion.getZ();
        float w = quaternion.getW();
        float x2 = vector.getX();
        float y2 = vector.getY();
        float z2 = vector.getZ();
        float f = (w * x2) + ((y * z2) - (z * y2));
        float f2 = (w * y2) + ((z * x2) - (x * z2));
        float f3 = (w * z2) + ((x * y2) - (y * x2));
        float f4 = (y * f3) - (z * f2);
        float f5 = (z * f) - (f3 * x);
        float f6 = (x * f2) - (y * f);
        float f7 = 2;
        return new Vector3((f4 * f7) + x2, (f5 * f7) + y2, (f7 * f6) + z2);
    }

    public final Pose translate(Vector3 translation) {
        return new Pose(this.translation.plus(translation), this.rotation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pose(Vector3 vector3) {
        this(vector3, null, 2, 0 == true ? 1 : 0);
    }

    public final Pose copy(Vector3 vector3) {
        return copy$default(this, vector3, null, 2, null);
    }

    public Pose(Vector3 vector3, Quaternion quaternion) {
        this.translation = vector3;
        this.rotation = quaternion;
    }

    public final Pose copy(Vector3 translation, Quaternion rotation) {
        return new Pose(translation, rotation);
    }

    public static final Pose fromLookAt(Vector3 vector3, Vector3 vector4, Vector3 vector5) {
        Companion.getClass();
        Vector3 normalized = vector4.minus(vector3).toNormalized();
        fit0 fit0Var = Quaternion.Companion;
        Vector3 vector3UnaryMinus = normalized.unaryMinus();
        fit0Var.getClass();
        return new Pose(vector3, fit0.m41773c(vector3UnaryMinus, vector5));
    }

    public /* synthetic */ Pose(Vector3 vector3, Quaternion quaternion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Vector3(0.0f, 0.0f, 0.0f, 7, null) : vector3, (i & 2) != 0 ? new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : quaternion);
    }

    public Pose(Pose pose) {
        this(pose.translation, pose.rotation);
    }
}
