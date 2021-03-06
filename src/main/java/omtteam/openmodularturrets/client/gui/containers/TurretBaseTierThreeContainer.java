package omtteam.openmodularturrets.client.gui.containers;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import omtteam.openmodularturrets.client.gui.customSlot.AddonSlot;
import omtteam.openmodularturrets.client.gui.customSlot.AmmoSlot;
import omtteam.openmodularturrets.client.gui.customSlot.UpgradeSlot;
import omtteam.openmodularturrets.tileentity.TurretBase;

public class TurretBaseTierThreeContainer extends TurretBaseContainer {
    public TurretBaseTierThreeContainer(InventoryPlayer inventoryPlayer, TurretBase te) {
        this.tileEntity = te;

        for (int x = 0; x < 9; x++) {
            this.addSlotToContainer(new Slot(inventoryPlayer, x, 8 + x * 18, 142));
        }

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                this.addSlotToContainer(new Slot(inventoryPlayer, 9 + x + y * 9, 8 + x * 18, 84 + y * 18));
            }
        }

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                addSlotToContainer(new AmmoSlot(tileEntity.getInventory(), x + y * 3, 8 + x * 18, 17 + y * 18));
            }
        }

        addSlotToContainer(new AddonSlot(tileEntity.getInventory(), 9, 72, 18));
        addSlotToContainer(new AddonSlot(tileEntity.getInventory(), 10, 92, 18));
        addSlotToContainer(new UpgradeSlot(tileEntity.getInventory(), 11, 72, 52));
    }
}