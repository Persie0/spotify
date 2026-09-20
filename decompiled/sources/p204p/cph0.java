package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cph0 {
    public final String toString() {
        if (this instanceof uoh0) {
            return "ConditionSatisfied";
        }
        if (this instanceof voh0) {
            return "ConditionUnsatisfied";
        }
        if (this instanceof woh0) {
            return "Deinitialize";
        }
        if (this instanceof xoh0) {
            return "Deinitialized";
        }
        if (this instanceof zoh0) {
            return "SetSubscriber";
        }
        if (this instanceof yoh0) {
            return "RemoveSubscriber";
        }
        if (this instanceof toh0) {
            return "ComponentInitialized";
        }
        if (this instanceof bph0) {
            return "ShutdownHooksCompleted";
        }
        if (this instanceof aph0) {
            return "ShutdownCompleted";
        }
        throw new NoWhenBranchMatchedException();
    }
}
